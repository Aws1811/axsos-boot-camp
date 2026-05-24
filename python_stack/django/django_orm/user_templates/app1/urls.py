from django.urls import path
from . import views

urlpatterns = [
    path('', views.landing, name='landing'),
    path('result', views.index, name='index'),
    # path('delete/<int:user_id>/', views.delete_user),
]