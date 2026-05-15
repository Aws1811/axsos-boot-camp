from flask import Flask , render_template , redirect , session

app = Flask(__name__)
app.secret_key = 'aws'
@app.route('/')
def counter():
    if 'count' not in session:
        session['count'] = 0
    session['count'] += 1
    return render_template("index.html",counter=session['count'])

@app.route('/destroy')
def destroy():
    session.clear()
    return redirect('/')

@app.route('/plus2')
def plus():
    session['count'] += 1
    return redirect('/')

if __name__ == "__main__":
    app.run(debug=True , port=5001)