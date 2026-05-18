from django.shortcuts import render, redirect
from django.http import HttpResponse, JsonResponse

# this will went us to blogs path

def index(request):
    print("index function is done")
    return HttpResponse("place holder for blogs later i think")

#this will went us to / path 

def root(request):
    print(" root function is done ")
    return redirect('/blogs')

# this will went us to blgos new path

def new(request):
    print("new function is done")
    return HttpResponse("place holder to display a new form to creat a new blog")

# this will went us to blogs/create path

def create(request):
    print("create function is done")
    return redirect('/')

# this will went us to blogs number giving by the useer

def show(request,id):
    return HttpResponse(f"placeholder to display blog number: {id}")

# this will went us to blogs and number givin by user and edit

def edit(request,id):
    return HttpResponse(f"a placeholder to siplay an editit number {id}")

# this will went us again to the main one /

def destroy(request,id):
    return redirect('/')

#  this will went us tto the json file

def aws(request):
    return JsonResponse({"response":" what is going is what is coming", "status":True })