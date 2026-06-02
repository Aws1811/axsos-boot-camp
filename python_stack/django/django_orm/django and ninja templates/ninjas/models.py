from django.db import models

# classes of the data
class Dojos(models.Model):
    name = models.CharField(max_length=255)
    city = models.CharField(max_length=255)
    state = models.CharField(max_length=255)
    desc = models.TextField(null=True)

class Ninjas(models.Model):
    dojo = models.ForeignKey(Dojos,related_name="ninjas",on_delete=models.CASCADE ,null=True)
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)

# the data of creating  the dojo
def create_dojo(data):
    Dojos.objects.create(
            name = data['name'],
            city = data['city'],
            state = data['state'],
            desc = data['desc'],
        )

#  here to get the data like id from the Dojo class to use it in views
def create_ninja(data):
    the_dojo = Dojos.objects.get(id = data['select'])

    Ninjas.objects.create(
        first_name =data['first_name'],
        last_name = data['last_name'],
        dojo = the_dojo
    )

# here we get the id of data of dojo id  to do the delete button
def delete_dojos(data):
    Dojos.objects.get(id = data['dojo_id']).delete()

# here to use it to show all the data in our page
def the_shows():
    return Dojos.objects.all()