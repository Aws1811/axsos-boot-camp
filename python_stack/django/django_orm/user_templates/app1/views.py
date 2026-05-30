from django.shortcuts import render , redirect
from .models import User

#  🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ here for rendering the html page ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
def landing(request):
    users = User.objects.all()
    return render(request, 'index.html', {'users': users})
def index(request):

#  🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ here is the form function of submit ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
    if request.method == 'POST':
        firstname = request.POST.get('firstname')
        lastname = request.POST.get('lastname')
        email = request.POST.get('email')
        age = request.POST.get('age')

        user = User(firstname=firstname, lastname=lastname, email=email, age=age)
        user.save()

    return redirect('/')


#  🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ  here is for deleting the records ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑

def delete_user(request, user_id):
    user = User.objects.get(id=user_id)
    user.delete()
    return redirect('/')
