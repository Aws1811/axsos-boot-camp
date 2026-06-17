from django.urls import path
from . import views

urlpatterns = [
    path('',views.index , name="main"),
    path('reg/',views.reg_form ,name="reg"),
    path('login/',views.login_form, name="login"),
    path('wall/',views.success,name="wall"),
    path('logout/',views.logout, name="logout"),
    path('send/', views.send_post),
    path('comme/',views.add_comment),
    path('delete/<int:id>',views.delete),
]