from django.db import models

# this is book class
class Book(models.Model):
    title = models.CharField(max_length=255)
    desc = models.CharField(max_length=45)
    #autors
# this is autor class 
class Author(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
# add this after making the authors and make it nullable
    text = models.TextField(null=True)
    the_book = models.ManyToManyField(Book,related_name="authors")

# function for adding  a new book
def adding_book_mod(data):
    Book.objects.create(
        title = data['title'],
        desc = data['desc'],
    )

# for adding a new author
def adding_author_mod(data):
    Author.objects.create(
        first_name = data['first_name'],
        last_name =data['last_name'],
        text = data['text'],
    )

# for showing all books
def show_books():
    return Book.objects.all()

# for showing all authors
def show_authors():
    return Author.objects.all()

#  for adding an author for books
def add_author_to_book(book_id,author_id):
    book = Book.objects.get(id= book_id)
    author = Author.objects.get(id = author_id)
    book.authors.add(author)

# for adding book to the author
def add_book_to_author(author_id,book_id):
    book = Book.objects.get(id = book_id)
    author = Author.objects.get(id = author_id)
    author.the_book.add(book)