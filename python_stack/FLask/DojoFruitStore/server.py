from flask import Flask, render_template, request
app = Flask(__name__)  

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ this for showen the first page of route ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
@app.route('/')         
def index():
    return render_template("index.html")

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ this route for moving to the next page ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
@app.route('/checkout', methods=['POST'])         
def checkout():
    strawberry =request.form['strawberry']
    raspberry = request.form['raspberry']
    apple = request.form['apple']
    first = request.form['first_name']
    last = request.form['last_name']
    student = request.form['student_id']
    count = int(apple)+int(strawberry)+int(raspberry)
    customer_name = first + last
    print(request.form)
    print(f"charging {customer_name } for {count} fruits.")
    return render_template(
    "checkout.html",
    first_temp = first,
    last_temp = last,
    strawberry_temp = strawberry,
    raspberry_temp = raspberry,
    apple_temp = apple,
    student_temp = student,
    )

# 🞑ᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒᗒ this is for moving to the img route ᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕᗕ🞑
@app.route('/fruits')         
def fruits():
    return render_template("fruits.html")

if __name__=="__main__":   
    app.run(debug=True)    