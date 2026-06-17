from django.db import models
import re
import bcrypt
from datetime import date

class ManagerLogin(models.Manager):
    def login_valid(self,valid_data):
        errors = {}
        if valid_data['date'] >= str(date.today()):
            errors['date'] = "try something in past man"
        
        elif int(date.today().year) - int(valid_data['date'].split('-')[0]) <13:
            errors['date'] = "the user must be bigger than 13 years old"

        if len(valid_data['first_name']) < 2:
            errors['first_name'] = "name must be more than 2 charcters"

        if len(valid_data['last_name']) < 2 :
            errors['last_name'] = "name must be more than 2 charcters"

        if len(valid_data['password']) < 8 : 
            errors['password'] = "password must be more than 8 charcters"

        email_regex = re.compile(r'^[\w.-]+@[\w.-]+\.\w+$')
        if not email_regex.match(valid_data['email']):
            errors['email'] = "Invalid email format"

        name_regex = re.compile(r'^[a-zA-Z]+$')
        if not name_regex.match(valid_data['first_name']):
            errors['first_name'] = " first name must be enter with only a-z / A-Z charcters"

        if not name_regex.match(valid_data['last_name']):
            errors['last_name'] =  "last name must be enter with only a-z / A-Z charcters"

        if valid_data['password'] != valid_data['confirm_password']:
            errors['confirm_password'] = "not a matching password"

        if len(Login.objects.filter(email = valid_data['email'])) >0:
            errors['email'] = "Email is already exists"
        return errors

class Login(models.Model):
    first_name = models.CharField(max_length=50)
    last_name =  models.CharField(max_length=50)
    email =models.CharField(max_length=100)
    password = models.CharField(max_length=100)
    date = models.DateField(null=True)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    objects = ManagerLogin()

def create_account(data):
    hashed = bcrypt.hashpw(data['password'].encode(), bcrypt.gensalt()).decode()
    Login.objects.create(
        first_name = data['first_name'],
        last_name = data['last_name'],
        email = data['email'],
        date = data['date'],
        password = hashed,
    )

def enter_account(data):
    user_email = Login.objects.filter(email=data['email'])
    if len(user_email) > 0 :
        if bcrypt.checkpw(data['password'].encode(), user_email[0].password.encode()):
            return user_email[0]
        return False


def show_data():
    return Login.objects.all()
