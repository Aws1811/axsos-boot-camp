from flask import Flask

# hello world  -----------------------------------------------------------X
app = Flask(__name__)

@app.route('/')
def hello_world():
    return "Hello World!"

# champion ---------------------------------------------------------------X

@app.route('/champion')
def champ():
    return "champion!!"

# name change

@app.route('/say/<name>')
def hi(name):
    print(name)
    return "Hi " + name

#spamming

@app.route('/report/<int:num>/<value>')
def n(num , value):
    for i in range(num):
        print(value)
    return (value +' _  _ ') * num


# running code
if __name__ == "__main__":
    app.run(debug=True)
