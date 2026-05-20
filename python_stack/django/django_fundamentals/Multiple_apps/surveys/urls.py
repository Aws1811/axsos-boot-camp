from django.urls import path
from . import views

urlpatterns = [
    path('/surveys',views.surveys),
    path('/surveys/new',views.surveys_new),
]