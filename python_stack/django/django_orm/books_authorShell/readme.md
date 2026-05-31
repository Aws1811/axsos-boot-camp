# Books & Authors — Many to Many

## Preview

this assignemnt is about preparing to do the realtion between the class in tempaltes

## Run the app

```
# 1. create virtual environment
python -m venv venv

# 2. activate it
call djangoPy3Env\Scripts\activate

# 3. create the project
django-admin startproject booksproject

# 4. create the app
python manage.py startapp books_app

# 5. run migrations
python manage.py makemigrations
python manage.py migrate

# 6. open the shell
python manage.py shell
```

## Built With

- [Django](https://www.djangoproject.com/) — Python web framework
- Django ORM — Many to Many relationships via the shell

## Features

- `Book` model with title and description
- `Authors` model with first name, last name, and a ManyToMany relation to books via a through table
- `Authors_has_books` — junction table connecting authors and books
- Create 5 books and 5 authors
- Assign authors to multiple books using `.add()`
- Retrieve all authors of a book and all books of an author
- Remove an author from a book using `.remove()`
- Update book title and author name via the shell