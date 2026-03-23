// var like = document.querySelectorAll("button");
var like1 = document.querySelector(".button1");
var like2 = document.querySelector(".button2");
var like3 = document.querySelector(".button3");
var counter1 = document.querySelector(".span1");
var counter2 = document.querySelector(".span2");
var counter3 = document.querySelector(".span3");
like1.addEventListener("click",function(){
    counter1.innerText++;
    counter1 = false;
});
like2.addEventListener("click",function(){
    counter2.innerText++;
    counter2 = false;
});
like3.addEventListener("click",function(){
    counter3.innerText++;
    counter3 = false;
});



