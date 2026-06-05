from django.shortcuts import render , redirect ,HttpResponse
from .models import *
from django.contrib import messages

#for going to the add show index
def index(request):
    return render(request,"addshow.html")

# to start the form post request or go to editshow page
def edit_show(request,id):
    if request.method=="POST":
        errors = Show.objects.edit_valid(request.POST)
        if len(errors) > 0:
            for key,value in errors.items():
                messages.error(request,value)
            return redirect(f'/editshow/{id}')
        else:
            update_show(request.POST,id)
            messages.success(request,"edited submited")
            return redirect("/")
    else :
        show = get_show_id(id)
        return render(request, "editshow.html", {'show': show})

# for adding a new show or go to the addshow page
def add_show(request):
    if request.method == 'POST' :
        errors = Show.objects.show_valid(request.POST)
        if len(errors)  >0:
            for key,value in errors.items():
                messages.error(request,value)
            return redirect('addshow')
        else:
            create_show(request.POST)
            messages.success(request, "Show is created pal.")
            return redirect ('/')

    else :
        return render(request, "addshow.html")

#for going to the main table with the data showin
def all_show(request):
    shows =all_the_shows()
    return render(request, "allshow.html", {'shows':shows})

# for going to tv_show page
def tv_show(request,id):
    tv_id = get_show_id(id)
    theshows =all_the_shows()
    return render(request,"Tvshows.html",{'tv_id':tv_id,'theshows':theshows})

#for deleteing a show from existing
def delete_show(request,id):
    delete_procress(id)
    return redirect('/')

