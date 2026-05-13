from flask import Flask , render_template

app = Flask(__name__)

@app.route('/')
def first(x = 8 ,y = 8):
    return render_template("index.html", x=int(x) , y=int(y),color1="red", color2="black")

@app.route('/<x>')
def sec(x=8,y=8):
    return render_template("index.html", x=int(x) , y=int(y),color1="red", color2="black")

@app.route('/<x>/<y>')
def thrd(x=8,y=8):
    return render_template("index.html", x=int(x) , y=int(y),color1="red", color2="black")

@app.route('/<x>/<y>/<color1>/<color2>')
def four(x=8,y=8,color1="Red",color2="Black"):
    return render_template("index.html", x=int(x) , y=int(y) ,color1 = str(color1),color2 = str(color2))


if __name__ == "__main__":
    app.run(debug=True)