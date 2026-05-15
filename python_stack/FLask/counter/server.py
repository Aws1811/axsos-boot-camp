from flask import Flask , render_template , redirect, session

app = Flask(__name__)
app.secret_key = 'aws'

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ main page of the counters ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
@app.route('/')

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ  this is for user to play with the counter ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
def counter():
    if 'count' not in session:
        session['count'] = 0
    session['count'] += 1

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ this is the main counter the increase with page refresh ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
    if 'actual' not in session:
        session['actual'] = 0
    session['actual'] += 1
    return render_template("index.html", actuals=session['actual'],counter=session['count'])

#🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ here for restert the user counter ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
@app.route('/destroy')
def destroy():
    session.pop('count',None)
    return redirect('/')

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ here for increase by fixed +2 ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
# 1 here + 1 with refreshing with redirect that why its not 2
@app.route('/plus2')
def plus():
    session['count'] += 1
    return redirect('/')

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ here for increase by n times ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
@app.route('/plus/<int:n>')
def nums(n):
    session['count'] += n
    return redirect('/')


#  here is im learned how to open 2 envu. at the same time with port changing 
if __name__ == "__main__":
    app.run(debug=True , port=5001)