from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('plus2',views.plus_two),
    path('destroy',views.destroy),
    path('plus/<int:val>',views.plus),
]