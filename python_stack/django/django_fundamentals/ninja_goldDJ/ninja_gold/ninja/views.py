from django.shortcuts import render,redirect
from random import randint , choice
# Create your views here.
def index(request):
    gold = request.session.get('gold',0)
    messages = request.session.get('messages',[])
    return render(request,'ninja/index.html', {'gold': gold, 'messages': messages})
def search(request):
    earn = 0
    if request.method == "POST":
        location = request.POST['location'] 
        if location == "farm":
            earn = randint(15,20)*choice([-1,1])
        elif location == "cave":
            earn = randint(5,10)*choice([-1,1])
        elif location == "house":
            earn = randint(2,5)*choice([-1,1])
        elif location == "casino":
            earn = randint(0,50)*choice([-1,1])
        request.session['gold']=request.session.get('gold',0)+earn
        messages = request.session.get('messages', [])
        messages.insert(0, f"Earned {earn} gold from the {location}")
        request.session['messages'] = messages
        request.session.modified = True
    return redirect('/')