from django.shortcuts import render, redirect
from .models import *

# revaeling the main page
def index(request):
    return render(request, "index.html")

#for revaling the book page
def newbook(request):
    the_book = show_books()
    return render(request, "addbook.html", {'the_book':the_book})

# for adding with form a new book to the form
def adding_book(request):
    if request.method == "POST":
        adding_book_mod(request.POST)
    return redirect('/books')

# for revaling the author page
def newauthor(request):
    the_author = show_authors()
    return render(request, "addauthor.html",{'the_author':the_author})

# for adding an author with form  to the table
def adding_author(request):
    if request.method == "POST":
        adding_author_mod(request.POST)
    return redirect('/authors')

# for showing the result page
def result(request):
    return render(request,"result.html")

#for collect data for the book with get method and use it to be revealed in result page
def result_book(request,id):
    all_author = show_authors()
    book =Book.objects.get(id=id)
    return render(request,"result.html",{'book':book,'all_author':all_author})

#for collect data for the author with get method and use it to be revealed in result page
def result_author(request,id):
    author = Author.objects.get(id=id)
    all_books = show_books()
    return render(request,"result.html",{'author':author,'all_books':all_books})

# for connections and relations to add an author for the book
def addtoauthor(request,id):
    if request.method == "POST":
        add_book_to_author(id,request.POST['selectauthor'])
    return redirect(f'/result/author/{id}')

# for connections and relations to add book for the author

def addtobook(request,id):
    if request.method == "POST":
        add_author_to_book(id,request.POST['selectbook'])
    return redirect(f'/result/book/{id}')