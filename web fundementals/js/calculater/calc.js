var result=document.querySelector(".result");
var num1;
function press(num){
    if(result.innerText==="0"){
    result.innerText=num;
    }else {
        result.innerText+=num;
    }
}
function reset(){
    result.innerText = "0";
    // num1 = null;
}
// function multi(){
//     num1 = Number(result.innerText);
//     result.innerText ="0";
// }
// function plus(){
//     num1 = Number(result.innerText);
//     result.innerText = "0";
// }
var op = document.querySelector(".operator");
op.addEventListener('click',function(){
    num1 = Number(result.innerText);
    result.innerText = "0";
})
function equal(){
if(op=="*"){
        var num3 = Number(result.innerText);
        result.innerText = num3*num1;
    }else if (op==="+"){
        var num3 = Number(result.innerText);
        result.innerText = num3+num1;
    }
}
