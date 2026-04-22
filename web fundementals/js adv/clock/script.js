// Returns the number of seconds since the start of today
function getSecondsSinceStartOfDay() {
    return new Date().getSeconds() +
        new Date().getMinutes() * 60 +
        new Date().getHours() * 3600;
}
// the varibles
var timeMove = document.querySelector("#seconds");
var min = document.getElementById("minutes");
var hour = document.getElementById("hour");
let plus = 0;
let plusMin = 0;
let plusHour =0;
let warudo;
// the moveing clocks function
warudo =  setInterval(function(){
    // seconds moveing------------------------------------------------------------
    plus=plus+36;
    timeMove.style.transform = `rotate(${plus}deg)  translate(-50%,-100%)`;
    if(plus===360){
        // minutes moving------------------------------------------------------------
        plus=0;
        plusMin=plusMin+180;
        min.style.transform = `rotate(${plusMin}deg) translate(-50%,-100%)`;
    }
    if(plusMin===360){
        // hours moveing------------------------------------------------------------
    plusMin=0;
    plusHour=plusHour+36;
    hour.style.transform = `rotate(${plusHour}deg) translate(-50%,-100%)`
    }
    console.log(plus,plusMin,plusHour);
},1000);

var za = document.querySelector("button");
var sound = document.getElementById("sound");
var resume = document.getElementById("resume");
var fx = document.getElementById("timeStopFX");
var fx2 = document.getElementById("timeResumeFX");
var music = document.getElementById("time-stop-theme");
za.addEventListener('click', function () {
    sound.play(); 
    setTimeout(() => {
        fx.classList.remove("active");
        music.play();
    }, 600);
    setTimeout(function(){
        // warudo.currentTime = 0;
        clearInterval(warudo);
        fx.classList.add("active");
    }, 2200);
    
setTimeout(function () {
        resume.play();
        fx2.classList.add("active");
        setTimeout(() => {
        fx2.classList.remove("active");
        }, 2400);

        warudo = setInterval(function () {
        plus = plus + 36;
        timeMove.style.transform = `rotate(${plus}deg) translate(-50%,-100%)`;

        if (plus === 360) {
        plus = 0;
        plusMin = plusMin + 180;
        min.style.transform = `rotate(${plusMin}deg) translate(-50%,-100%)`;
        }

        if (plusMin === 360) {
        plusMin = 0;
        plusHour = plusHour + 36;
        hour.style.transform = `rotate(${plusHour}deg) translate(-50%,-100%)`;
        }
    }, 1000);
    }, 10000);
});







//an alternative code for svg to make the sticks of corner clock 
const ticksContainer = document.querySelector("#ticks");
for (let i = 0; i < 60; i++) {
    let tick = document.createElementNS("http://www.w3.org/2000/svg", "line");
    let isMain = i % 5 === 0; 
    tick.setAttribute("x1", 0);
    tick.setAttribute("y1", -140);
    tick.setAttribute("x2", 0);
    tick.setAttribute("y2", isMain ? -120 : -130);
    tick.setAttribute("stroke", "black");
    tick.setAttribute("stroke-width", isMain ? 3 : 1);
    tick.setAttribute("transform", `rotate(${i * 6})`);
    ticksContainer.appendChild(tick);
}

var hide = document.querySelector(".hide");
hide.addEventListener('click',function(){
    za.style.display = "block";
});