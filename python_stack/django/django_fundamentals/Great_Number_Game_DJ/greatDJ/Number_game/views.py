from django.shortcuts import render , redirect
from random import randint
# Create your views here.
def index(request):
    result =request.session.get('result',None)
    massage = None
    if request.method =="POST":
        user_guess = int(request.POST.get('the_answer'))
        if user_guess == result:
            massage = 'correct'
        elif user_guess+5 > result and user_guess-5 < result:
            massage = 'close'
        elif user_guess >result:
            massage = 'high'
        elif user_guess <result:
            massage = 'low'
    return render(request,'NUmber_game/index.html', {
        'massage':massage,
        # 'num' :result,
        })

def guess(request):
    return redirect('/')

def start_game(request):
    request.session['result'] = int(randint(0,100))
    # print("im here------------------===================")
    return redirect('/')

def refresh(request):
    request.session['result'] = int(randint(0,100))
    # print("im here------------------===================")
    return redirect('/')
