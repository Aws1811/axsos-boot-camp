# Users (Shell) — Django ORM

## Preview

*No preview — this assignment runs entirely in the Django shell*

## Run the app

```
# 1. create virtual environment
python -m venv venv

# 2. activate it
call djangoPy3Env\Scripts\activate

# 3. create the project
django-admin startproject single_model_orm

# 4. create the app
python manage.py startapp users_app

# 5. run migrations
python manage.py makemigrations
python manage.py migrate

# 6. open the shell
python manage.py shell
```

## Built With

- [Django](https://www.djangoproject.com/) — Python web framework
- Django ORM — for database queries via the shell

## Features

**Model: Users**
-  `id:(auto added)`,`first_name`, `last_name`, `email_address`, `age`, `created_at`, `updated_at`

**Shell Queries**
- Create 3 users
- Retrieve all users — `Users.objects.all()`
- Retrieve the last user — `Users.objects.last()`
- Retrieve the first user — `Users.objects.first()`
- Update last name of user with id=3 to Pancakes — `user.last_name = "Pancakes"` then `user.save()`
- Delete user with id=2 — `Users.objects.get(id=2).delete()`
- Get all users sorted by first name — `Users.objects.order_by("first_name").all()`
- Get all users sorted by first name descending — `Users.objects.order_by("-first_name").all()`