from django.shortcuts import render
from time import strftime ,gmtime

def index(request):
    context = {
        "time": strftime("%Y-%m-%d %H:%M %p", gmtime())
    }
    return render(request,'newapp/index.html',context)