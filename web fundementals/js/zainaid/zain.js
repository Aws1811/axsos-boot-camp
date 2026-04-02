var changePlanM = document.querySelector(".month");
var changePlanY= document.querySelector(".year");
var theNumber = document.querySelectorAll(".larg");
var span = document.querySelectorAll("#month");
changePlanY.addEventListener('click',function(){
    changePlanY.style.backgroundColor = "white";
    changePlanY.style.boxShadow = "1px 1px 4px";
    changePlanM.style.boxShadow = "none";
    changePlanM.style.backgroundColor = "#F7F7F7";
    for(var i = 0 ;i<theNumber.length;i++){
        if(i===0){
            theNumber[0].innerText ="$99.9";
        }else if(i===1){
            theNumber[i].innerText = "$129.9";
        }else{
            theNumber[i].innerText = "$159.9";
        }
    };
    
    span.forEach(Element=>{Element.innerText = "/Yearly"}); 
});
changePlanM.addEventListener('click',function(){
    changePlanY.style.backgroundColor = "#F7F7F7";
    changePlanY.style.boxShadow = "none";
    changePlanM.style.boxShadow = "1px 1px 4px";
    changePlanM.style.backgroundColor = "white";
    for(var i = 0 ;i<theNumber.length;i++){
        if(i===0){
            theNumber[i].innerText = "$19";
        }else if(i===1){
            theNumber[i].innerText = "$39";
        }else if (i===2){
            theNumber[i].innerText = "$59";
        }
    }
    span.forEach(Element=>{Element.innerText = "/monthly"});
});
var hide = document.querySelector(".hide");
var menu = document.querySelector(".img");
function toggleHide() {
    if (window.innerWidth < 1300) {
        hide.style.display = "none";
        menu.style.display = "inline-block"
    } else {
        hide.style.display = "block";
        menu.style.display = "none";
    }
}
window.addEventListener("resize", toggleHide);
toggleHide();

menu.addEventListener('mouseover',function(){
    menu.style.backgroundColor = "#E3E3E3";
});
menu.addEventListener('mouseout',function(){
    menu.style.backgroundColor = "";
});
var theMenu = document.querySelector(".theMenu");
var theMeenu = document.querySelector(".theMeenu");
menu.addEventListener('click',function(){
    theMenu.style.display = "flex";
    theMeenu.style.display = "flex";
});
theMenu.addEventListener('mouseleave',function(){
    // theMenu.style.display = "none";
    theMeenu.style.display = "none";
});