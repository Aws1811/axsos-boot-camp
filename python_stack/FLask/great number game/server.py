from flask import Flask, render_template, redirect, session, request
import random

app = Flask(__name__)
app.secret_key = 'aws'


# main  route
@app.route('/', methods=['GET', 'POST'])
def main():
    num = session.get('num', None)
    result = None

    if request.method == 'POST':
        the_answer = int(request.form['the_answer'])

        if the_answer == num:
            result = 'correct'
        elif abs(the_answer - num) <= 10:
            result = 'close'
        elif the_answer > num:
            result = 'high'
        else:
            result = 'low'

    started = session.get('started', False)
    return render_template("index.html", num=num, started=started, result=result)


#  here for getting the random numbers
@app.route('/random')
def randoms():
    session['num'] = random.randint(1, 1000)
    session['started'] = True
    return redirect('/')

# the refresh button to refresh the random number
@app.route('/refresh')
def refresh():
    session['num'] = random.randint(1, 1000)
    return redirect('/')

if __name__ == "__main__":
    app.run(debug=True)