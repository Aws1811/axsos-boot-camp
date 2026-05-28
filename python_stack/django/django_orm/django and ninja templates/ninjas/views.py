from django.shortcuts import render , redirect
from .models import Dojos, Ninjas

def index(request):
    dojos = Dojos.objects.all()
    return render(request, 'index.html', {'dojos': dojos})

def add_dojo(request):
    if request.method == "POST":
        Dojos.objects.create(
            name = request.POST['name'],
            city = request.POST['city'],
            state = request.POST['state'],
        )
    return redirect('/')

def add_ninja(request):
    if request.method == "POST":
        the_dojo = Dojos.objects.get(id = request.POST['select'])
        Ninjas.objects.create(
            first_name = request.POST['first_name'],
            last_name = request.POST['last_name'],
            dojo = the_dojo
        )
    return redirect('/')

def delete_dojo(request):
    if request.method == 'POST':
        Dojos.objects.get(id = request.POST['dojo_id']).delete()
    return redirect('/')
