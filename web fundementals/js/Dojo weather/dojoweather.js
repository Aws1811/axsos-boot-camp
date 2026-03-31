var accept = document.querySelector(".accept");
accept.addEventListener('click',function(){
    var cookie = document.querySelector(".lastmaindiv");
    cookie.style.display = "none";
})
var tempchange = document.querySelector("select");
tempchange.addEventListener('change',function(){
    notf.style.display= "flex";
})
var selectedCity = "";
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
    if(selectedCity=== "burbank"){
    row.forEach(element => {element.style.display = "flex"});
    row1.forEach(element => {element.style.display = "none"});
    row2.forEach(element => {element.style.display = "none"});
    }else if (selectedCity==="chicago"){
    row1.forEach(element => {element.style.display = "flex"});
    row.forEach(element => {element.style.display = "none"});
    row2.forEach(element => {element.style.display = "none"});
    }else if(selectedCity=== "dallas"){
    row2.forEach(element => {element.style.display = "flex"});
    row1.forEach(element => {element.style.display = "none"});
    row.forEach(element => {element.style.display = "none"});
    }
})
var row = document.querySelectorAll(".row");
var row1 = document.querySelectorAll(".row1");
var row2 = document.querySelectorAll(".row2");
var burbank = document.querySelector(".burbank");
burbank.addEventListener('click',function(){
    notf.style.display = "flex";
    selectedCity = "burbank";
    // row.forEach(element => {element.style.display = "flex"});
    // row1.forEach(element => {element.style.display = "none"});
    // row2.forEach(element => {element.style.display = "none"});
});
var chicago = document.querySelector(".Chicago");
chicago.addEventListener('click',function(){
    notf.style.display = "flex";
    selectedCity = "chicago";
    // row1.forEach(element => {element.style.display = "flex"});
    // row.forEach(element => {element.style.display = "none"});
    // row2.forEach(element => {element.style.display = "none"});
});
var dallas= document.querySelector(".Dallas");
dallas.addEventListener('click',function(){
    notf.style.display = "flex";
    selectedCity="dallas";
    // row2.forEach(element => {element.style.display = "flex"});
    // row1.forEach(element => {element.style.display = "none"});
    // row.forEach(element => {element.style.display = "none"});
});
