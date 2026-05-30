from django.shortcuts import render,redirect

# Create your views here.
def index(request):
    # ⤷ ──────────────────────── for refreshing increment ──────────────────────────↩
    request.session['counter'] =request.session.get('counter',0)+1
    request.session['actuals'] =request.session.get('actuals',0)+1
    return render(request,'index.html')
def plus_two(request):
    # ⤷ ──────────────────────── for increment by 2 ──────────────────────────↩
    request.session['counter'] =request.session.get('counter',0)+1
    return redirect('/')
def destroy(request):
    # ⤷ ──────────────────────── for refreshing the counter ──────────────────────────↩
    request.session['counter'] =request.session.get('counter',0)*0
    # or i can use request.session.flush()
    return redirect('/')
    #  ⤷ ──────────────────────── for increment by a settin val ──────────────────────────↩
def plus(request,val):
    request.session['counter'] =request.session.get('counter',0)+val
    return redirect('/')

