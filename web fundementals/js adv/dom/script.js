// the variblise
var pablo = document.querySelector("#pablo");
var call = document.querySelectorAll("button");
var span = document.querySelector("h2");
var body = document.querySelector("main");
var sisimg = document.querySelector("figure");
var little = document.querySelector(".little-bro");
var big = document.querySelector(".big-bro");
var cat = document.querySelector(".cat");
var aws = document.querySelector(".aws");
var dad = document.querySelector(".dad");
// the main function of buttons
call.forEach( (el,i) =>{el.addEventListener('click',function(){
    // reset before start
        pablo.previousElementSibling.classList.remove("act");
        pablo.nextElementSibling.classList.remove("act");
        pablo.previousElementSibling.previousElementSibling.classList.remove("sis");
        little.style.display = "none";
        big.style.display = "none";
        sisimg.style.display = "none";
        pablo.classList.remove("pablo");
        pablo.nextElementSibling.nextElementSibling.classList.remove("cats");
        cat.style.display = "none";
        span.style.backgroundColor = "unset";
        pablo.parentElement.classList.remove("father");
        dad.style.display = "none";
        body.style.backgroundImage = "none";
        // first button the brothers--------------------------------------------------------
    if(i===0){
        little.style.display = "block";
        big.style.display = "block";
        pablo.previousElementSibling.classList.add("act");
        pablo.nextElementSibling.classList.add("act");
        span.innerText = "Pablo Big Bro and Pablo Little Bro";
        }else if(i===1){
            // secound button the sisters--------------------------------------------------------
        sisimg.style.display = "block";    
        span.innerText = " ♡   Pablo beloved Sister  ♡ ";
        pablo.previousElementSibling.previousElementSibling.classList.add("sis");
        body.style.backgroundImage = "url(hearts.jpg)";
        span.style.backgroundColor = "black";
    }else if(i===2){
        // third button pablo himself--------------------------------------------------------
        pablo.classList.add("pablo");
        span.style.backgroundColor = "black";
        span.innerText = "im Paaaabloooo waawaawawawaw";
        body.style.backgroundImage = "url(a2c112d8d01689ddcf533fb3f3d66113.jpg)";
    }else if(i===3){
        // forth button pablo cat--------------------------------------------------------
        span.innerText = "This is Pablo Best gangasta cat";
        span.style.backgroundColor = "black";
        cat.style.display = "block";
        cat.style.transform = "scale(1.5)";
        pablo.nextElementSibling.nextElementSibling.classList.add("cats");
        body.style.backgroundImage = "url(gangbody.jpg)";
    }else if(i===4){
        // fifth  button pablo father--------------------------------------------------------
        pablo.parentElement.classList.add("father");
        span.innerText = "I'm the father of this house";
        dad.style.display = "block"
    }
    });
});

// h1 resert button
var h1 = document.querySelector("h1");
h1.addEventListener('click',function(){
        span.innerText = "Pablo?";
        pablo.previousElementSibling.classList.remove("act");
        pablo.nextElementSibling.classList.remove("act");
        pablo.previousElementSibling.previousElementSibling.classList.remove("sis");
        little.style.display = "none";
        big.style.display = "none";
        sisimg.style.display = "none";
        pablo.classList.remove("pablo");
        pablo.nextElementSibling.nextElementSibling.classList.remove("cats");
        cat.style.display = "none";
        span.style.backgroundColor = "unset";
        pablo.parentElement.classList.remove("father");
        dad.style.display = "none";
        body.style.backgroundImage = "none";
})