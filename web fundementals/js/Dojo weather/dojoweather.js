var accept = document.querySelector(".accept");
accept.addEventListener('click',function(){
    var cookie = document.querySelector(".lastmaindiv");
    cookie.style.display = "none";
})
var tempchange = document.querySelector("select");
tempchange.addEventListener('change',function(){
    notf.style.display= "flex";
    // var temp = document.querySelector("select").value;
    // var red = document.querySelectorAll(".red");
    // var red1 = document.querySelectorAll(".red1");
    // var blue = document.querySelectorAll(".blue");
    // var blue1 = document.querySelectorAll(".blue1");
    //     if(temp === "tempc"){
    //     red.forEach(element => {element.style.display = "inline-block"});
    //     red1.forEach(element => {element.style.display = "none"});
    //     blue.forEach(element => {element.style.display = "inline-block"});
    //     blue1.forEach(element => {element.style.display = "none"});
    //     // red.forEach(function(elem){elem.style.display = "inline-block"});
    // }else{
    //     red.forEach(element => {element.style.display = "none"});
    //     red1.forEach(element => {element.style.display = "inline-block"});
    //     blue.forEach(element => {element.style.display = "none"});
    //     blue1.forEach(element => {element.style.display = "inline-block"});
    // }
})
var notf = document.querySelector("article");
var ok = document.querySelector(".ok");
ok.addEventListener('click',function(){
    notf.style.display = "none";
        var temp = document.querySelector("select").value;
    var red = document.querySelectorAll(".red");
    var red1 = document.querySelectorAll(".red1");
    var blue = document.querySelectorAll(".blue");
    var blue1 = document.querySelectorAll(".blue1");
        if(temp === "tempc"){
        red.forEach(element => {element.style.display = "inline-block"});
        red1.forEach(element => {element.style.display = "none"});
        blue.forEach(element => {element.style.display = "inline-block"});
        blue1.forEach(element => {element.style.display = "none"});
        // red.forEach(function(elem){elem.style.display = "inline-block"});
    }else{
        red.forEach(element => {element.style.display = "none"});
        red1.forEach(element => {element.style.display = "inline-block"});
        blue.forEach(element => {element.style.display = "none"});
        blue1.forEach(element => {element.style.display = "inline-block"});
    }
})