console.log("page loaded...");
function sub(elem){
    if ( elem.innerText == "Subscribe") {
        elem.innerText = "Subscribed";
    alert("someone sub to u");  
    }else if (elem.innerText == "Subscribed"){
        elem.innerText = "Subscribe";
    }
}
function login(elem){
    if (elem.innerText == "Sign Out") {
        elem.innerText = "Login";
        alert("you have been quit your account");
    }else if (elem.innerText = "Login") {
        elem.innerText = "Sign Out";
        alert("you have been enter your account");
    }
}
var imgGoUp = document.querySelectorAll(".vid-s");
var videoStart = document.querySelectorAll(".videos");
function Over(params) {
    console.log(params.children);
    var img = params.children[0];
    var vide = params.children[1];
    img.style.zIndex = -1;
    vide.style.zInedx = 1;
}
function Out(params) {
    console.log(params.children);
    var img = params.children[0];
    var vide = params.children[1];
    img.style.zIndex =1;
    vide.style.zInedx =-1;
}
    function show(elem){
        elem.play();
        elem.currentTime = 0 ;
    }
    function hide(elem){
        elem.pause();
        elem.currentTime = 0;
    }



























































    
// function showIt(params) {
    //     params.style.zIndex = "-1";
    // }
    // function show(elem) {
        //         elem.play();
        //         elem.currentTime = 0;
        // }
        // function stopshow(elem) {
            //     elem.pause();
            //     console.log(imgGoUp , videoGoUp);
            //     videoGoUp.style.zIndex = "-1";
            //     imgGoUp.style.zIndex = "1";
            // }
            // function hideit(params) {
            //     params.style.zIndex = "-1";
            // }