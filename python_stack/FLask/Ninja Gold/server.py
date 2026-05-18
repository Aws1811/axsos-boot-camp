from flask import Flask , render_template,redirect , request , session
import random

app = Flask(__name__)
app.secret_key = 'aws'

#  main page
@app.route('/')
def subm():

    # for getting the gold int with the def value of 0
    gold = session.get('gold',0)

    # for revealing the message and how much the suere get money
    messages = session.get('messages',[])
    return render_template("index.html",gold = int(gold) , messages = messages)

@app.route('/search' , methods = ['POST'])
def searching():
    location = request.form['location']

# for getting  the random element on getting on submitting 
    if location == "farm":
        earn = random.randint(15,20)*random.choice([-1,1])
    elif location == "cave":
        earn = random.randint(5,10)*random.choice([-1,1])
    elif location == "house":
        earn = random.randint(2,5)*random.choice([-1,1])
    elif location == "casino":
        earn = random.randint(0,50)*random.choice([-1,1])

#  for debugging in terminal
    print(f"location: {location}, earn: {earn}")

#  for getting the  values i need and storing them and use them in main page
    session['gold'] = session.get('gold',0) + earn
    session['messages'] = session.get('messages', [])
    session['messages'].insert(0,f"earned {earn} golds from the {location}")
    session.modified = True
    return redirect('/')

if __name__ == "__main__":
    app.run(debug = True)