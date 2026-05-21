startButton = document.getElementById("start_game");
form = document.querySelector(".the-form");
main = document.querySelector("main");
startButton.addEventListener('click', function(){
    // form.style.display = "flex";
    // startButton.style.display = "none";
    window.location.href = '/start/'; 
});