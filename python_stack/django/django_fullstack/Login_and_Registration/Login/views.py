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
            return redirect('/done')
        else:
            messages.error(request,"invalid email or password")
            return redirect('/')

def success(request):
    if 'user_id' not in request.session:
        return redirect('/')
    user = Login.objects.get(id=request.session['user_id'])
    return render(request,"success.html",{"user":user})

def logout(request):
    request.session.flush()
    return redirect('/')    