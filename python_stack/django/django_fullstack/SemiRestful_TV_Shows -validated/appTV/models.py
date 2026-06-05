from django.db import models
# manager for errors and showing them  of length is not matches the condietion
class ShowManager(models.Manager):
    def show_valid(self,showData):
        errors = {}
        if len(showData['title']) < 2:
            errors['title'] = "Show title should be 2 letters or more ,bro"
        if len(showData['network']) <3:
            errors['network'] = "Network must be more than 2 letters , bro"
        if len(showData['desc']) <10:
            errors['desc'] = "description need to be pretty and will written like 10 charcters , bro"
        
        # if release_date
        return errors
    def edit_valid(self,showData):
        errors = {}
        if len(showData['title']) < 2:
            errors['title'] = "edited must be 2 letters or more"
        if len(showData['network']) <3:
            errors['network'] = "edited Network must be more than 2 letters "
        if len(showData['desc']) <10:
            errors['desc'] = "edited description must be more than 10 charcters"
        return errors
        
        


# table of the data
class Show(models.Model):
    title = models.CharField(max_length=50)
    network = models.CharField(max_length=20)
    release_date = models.DateField()
    desc = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()


# for creating a new show to the data
def create_show(data):
    Show.objects.create(
    title=data['title'],
    network=data['network'],
    release_date=data['release_date'],
    desc=data['desc'],
    )

# for updating an existing show 
def update_show(data,id):
    show =Show.objects.get(id = id)
    show.title = data['title']
    show.network=data['network']
    show.release_date=data['release_date']
    show.desc=data['desc']
    show.save()

# for showing all data
def all_the_shows():
    return Show.objects.all()

# for getting and reveal an spesfic show by its id
def get_show_id(id):
    return Show.objects.get(id=id)

# for deleteing a show from data
def delete_procress(id):
    deleting = Show.objects.get(id=id)
    deleting.delete()