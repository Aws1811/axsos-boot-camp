from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request,'index.html')
def login(request):
    if request.method == "POST":
        main = {
            'name' : request.POST['name'],
            'location' : request.POST['location'],
            'language' : request.POST['language'],
            'comment' : request.POST['comment'],
        }
        return render(request,"result.html",main)
    else:
        return render(request,"index.html")