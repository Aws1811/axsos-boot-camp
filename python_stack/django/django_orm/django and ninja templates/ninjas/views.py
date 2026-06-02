from django.shortcuts import render , redirect
from .models import *

# this method for reveal the main page 
def index(request):
    dojos = the_shows()
    return render(request, 'index.html', {'dojos': dojos})

# this method for adding a new method
def add_dojo(request):
    if request.method == "POST":
        create_dojo(request.POST)
    return redirect('/')

# this method for adding new ninja
def add_ninja(request): 
    if request.method == "POST":
        create_ninja(request.POST)
    return redirect('/')

# this method for deleteing exiesting method
def delete_dojo(request):
    if request.method == 'POST':
        delete_dojos(request.POST)
    return redirect('/')

