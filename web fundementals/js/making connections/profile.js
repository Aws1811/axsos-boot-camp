var sign = document.querySelector(".signout");
sign.addEventListener("click",function(){
    if(sign.innerText ==="Sign in"){
        sign.innerText = "Sign out";
    }else {
        sign.innerText = "Sign in";
    }
}); 

var typeInput =  '<input type="text" class = "inputclass">';
var changeName = document.querySelector(".Jane");
var oke = document.querySelector(".okey");
function edit() {
    changeName.outerHTML = typeInput;
    oke.style.display = "inline-block"; 
}
var submit = document.querySelector("input");
function ok(){
var newNameValue = document.querySelector(".inputclass");
var newname = newNameValue.value;
newNameValue.outerHTML = '<h2 class = "Jane">' + newname + '<h2>'
var changeName = document.querySelector(".Jane");
oke.style.display = "none";
}
var req2 = document.querySelector(".req2");
var con500 = document.querySelector(".con500");
function accept(elem) {
    elem.closest(".linereq").style.display = "none";
    req2.innerText--;
    con500.innerText++;

}
function False(elem){
    elem.closest(".linereq").style.display = "none";
    req2.innerText--;
}
