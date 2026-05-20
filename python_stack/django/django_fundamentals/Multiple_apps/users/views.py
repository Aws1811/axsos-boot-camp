from django.shortcuts import render
from django.http import HttpResponse

def regester(request):
    return HttpResponse('placeholder fo users to create a new user record')
def login(request):
    return HttpResponse('placeholder to login')
def user(request):
    return HttpResponse('placeholder to display all the list of users later.')

