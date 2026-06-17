from django.shortcuts import render , redirect
from .models import *
from django.contrib import messages


def index(request):
    data = show_data()
    return render (request,"index.html",{'data':data})

def reg_form(request):
    if request.method == "POST":
        errors = Login.objects.login_valid(request.POST)
        if len(errors) >0 :
            for key,value in errors.items():
                messages.error(request,value)
            return redirect('/')
        else:
            create_account(request.POST)
            messages.success(request,"DONE")
            return redirect('/')
    else:
        data = show_data()
        return render(request,"index.html",{'data': data})

def login_form(request):
    if request.method == "POST":
        result = enter_account(request.POST)
        if result:
            request.session['user_id'] = result.id
            return redirect('/wall')
        else:
            messages.error(request,"invalid email or password")
            return redirect('/')


def logout(request):
    request.session.flush()
    return redirect('/')    





def success(request):
    if 'user_id' not in request.session:
        return redirect('/')
    user = Login.objects.get(id=request.session['user_id'])
    vmes = show_messages() 
    return render(request,"success.html",{"user":user,"vmes":vmes})


def send_post(request):
    if request.method == "POST":
        user =Login.objects.get(id = request.session['user_id'])
        create_message(request.POST,user)
        return redirect('/wall')
    else:
        return render(request,"success.html")


def add_comment(request):
    if request.method == "POST":
        user =Login.objects.get(id = request.session['user_id'])
        create_comment(request.POST,user)
        return redirect('/wall')
    else:
        return render(request,"success.html")
    
def delete(request,id):
    delete_message(id)
    return redirect('/wall')