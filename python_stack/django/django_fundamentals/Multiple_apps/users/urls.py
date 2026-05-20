from django.urls import path
from . import views

urlpatterns = [
    path('/regester',views.regester),
    path('/login',views.login),
    path('/users/new',views.regester),
    path('/users',views.user),
]