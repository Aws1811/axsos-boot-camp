from django.db import models

# this is book class
class Book(models.Model):
    title = models.CharField(max_length=255)
    desc = models.CharField(max_length=45)

# this is autor class 
class Authors(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
# add this after making the authors and make it nullable
    text = models.TextField(null=True)
    the_book = models.ManyToManyField(Book,related_name="authors",through="Authors_has_books")

class Authors_has_books(models.Model):
    the_book = models.ForeignKey(Book,on_delete=models.CASCADE)
    the_author =models.ForeignKey(Authors , on_delete=models.CASCADE)