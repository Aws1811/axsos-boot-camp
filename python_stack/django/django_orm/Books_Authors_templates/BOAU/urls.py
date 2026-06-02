from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('books',views.newbook),
    path('addbook', views.adding_book),
    path('authors', views.newauthor),
    path('addauthor', views.adding_author),
    path('result',views.result),
    path('result/book/<int:id>',views.result_book),
    path('result/author/<int:id>',views.result_author),
    path('result/book/<int:id>/addtobook', views.addtobook),
    path('result/author/<int:id>/addtoauthor', views.addtoauthor),
]