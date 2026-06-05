from django.shortcuts import render, redirect
from .models import *
from django.contrib import messages

# main page of showing the table of courses and how to add a new course
def index(request):
    if request.method == "POST":
        errors = Courses.objects.course_valid(request.POST)
        #  the validation of checking if there an error or not
        if len(errors) > 0 :
            for key,value in errors.items():
                messages.error(request,value)
            return redirect('/')
        else:
            add_an_course(request.POST)
            messages.success(request,"DONE")
            return redirect('/')
    else:
        #  for showing the data in the table
        table_data = Courses.objects.all()
        return render(request,"index.html", {'table_data': table_data})

#  for going to the delete page on clicking
def go_delete_page(request,id):
    Courses.objects.get(id = id)
    the_id = Courses.objects.get(id = id)
    return render(request , "view.html", {'the_id': the_id})

#  for removing an existing course from database
def remove(request,id):
    Courses.objects.get(id = id).delete()
    return redirect('/')

