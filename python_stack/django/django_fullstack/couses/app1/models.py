from django.db import models

# class of the manager for validaitons
class CoManager(models.Manager):
    def course_valid(self,vdata):
        errors = {}
        # for checking if the name is less than 5 char
        if len(vdata['name']) < 5:
            errors['name'] = "  the name is small make it bigger than 5 characters"
        # for checking if the title is less than 15 char
        if len(vdata['desc'])< 15:
            errors['desc'] = ",And the description is short, make it bigger please"
        return errors

# the main class of the table called courses
class Courses(models.Model):
    name = models.CharField(max_length=50)
    desc = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = CoManager()

#  for adding a new course to the table and data 
def add_an_course(data):
    Courses.objects.create(
        name = data['name'],
        desc = data['desc'],
    )

#  for showin the courses
def show_the_coureses():
    return Courses.objects.all()

#  for getting a one id course to use it for deleting
def get_id_course(id):
    return   Courses.objects.get(id = id)
