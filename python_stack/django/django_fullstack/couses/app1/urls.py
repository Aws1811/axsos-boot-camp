from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('delete/<int:id>',views.go_delete_page),
    path('/remove/<int:id>',views.remove , name="remove"),
]