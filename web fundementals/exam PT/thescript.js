function color(elem){
elem.style.backgroundColor = "#3b4598";
elem=true;
}
function againcolor(elem){
    elem.style.backgroundColor = "#284bf9";
}
var change = document.querySelector("#hide");
var flip = document.querySelector("#flup");
var flipagain = document.querySelector("#goback");
var change2 = document.querySelector("#section2");
var theimg = document.querySelector(".bigimg");
flip.addEventListener('click',function(){
    change.style.display  = "flex";
    change2.style.display  = "none";
});
flipagain.addEventListener('click',function(){
    change.style.display  = "none";
    change2.style.display  = "flex";
    theimg.style.width = "60%";
});
var spam = document.querySelector("#spam");
var cardmain = document.querySelector("#allcards");
// var lorem = document.querySelector(".lorem");
var loremimg = document.querySelector(".loremimg");
// var hiddencard = document.querySelector("#hiddencard");
spam.addEventListener('click',function(){
    const newdiv = document.createElement("div");
    const lorem = document.createElement("p");
    const textlorem =document.createTextNode("Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur,quisquam impedit. Omnis possimus iste delectus laborum maiores alias dolores officiis velit, dolore numquam magnam quidem enim culpa autem libero sunt?");
    const loremimg = document.createElement("img");
    loremimg.src ='WebFund FSD-PT-OL-04-2025 -images and icons/features.png' ;
    lorem.appendChild(textlorem);
    newdiv.classList.add("card");
    newdiv.style.display = "flex";
    newdiv.style.flexDirection = "column";
    newdiv.style.alignItems = "center";
    newdiv.style.width = "33%";
    newdiv.style.margin = "60px 0px";
    newdiv.appendChild(loremimg);
    newdiv.appendChild(lorem);
    cardmain.appendChild(newdiv);
});