# Multiple Apps

## Run the app

```
# 1. create virtual environment
python -m venv venv

# 2. activate it
source venv/bin/activate        # mac / linux
venv\Scripts\activate           # windows

# 3. install django
pip install django

# 4. create the project
django-admin startproject multiapps

# 5. create the apps
python manage.py startapp blogs
python manage.py startapp surveys
python manage.py startapp users

# 6. run the server
python manage.py runserver
```

Then open your browser at: `http://127.0.0.1:8000`

## Built With

- [Django](https://www.djangoproject.com/) — Python web framework
- [Jinja2](https://jinja.palletsprojects.com/) — HTML templating engine

## Features

**Blogs**
- `/` — redirects to `/blogs`
- `/blogs` — placeholder for listing all blogs
- `/blogs/new` — placeholder for displaying a form to create a new blog
- `/blogs/create` — redirects to `/` after creating a blog
- `/blogs/<id>` — placeholder for displaying a single blog by ID
- `/blogs/<id>/edit` — placeholder for displaying an edit form for a blog
- `/blogs/<id>/destroy` — redirects to `/` after deleting a blog
- `/aws` — returns a JSON response with a custom message and status

**Surveys**
- `/surveys` — placeholder for displaying all surveys created
- `/surveys/new` — placeholder for users to add a new survey

**Users**
- `/register` — placeholder for users to create a new user record
- `/login` — placeholder for users to log in
- `/users/new` — handled by the same method as `/register`
- `/users` — placeholder for displaying all users