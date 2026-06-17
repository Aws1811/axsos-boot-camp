from django.urls import path
from . import views

urlpatterns = [
    path('',views.index , name="main"),
    path('reg/',views.reg_form ,name="reg"),
    path('login/',views.login_form, name="login"),
    path('done/',views.success,name="done"),
    path('logout/',views.logout, name="logout"),
]