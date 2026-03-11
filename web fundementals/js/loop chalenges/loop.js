// 1. Display odd numbers

function resultof1(){
    for (var i = 0;i<=20;i++){
        if(i%2!=0){
            console.log(i);
        }
    }
}
console.log(resultof1());

//2. Decreasing multiples of 3

function resultof2(){
    for (i=100;i>=0;i--) {
        if (i%3==0) {
            console.log(i);
        }
    }
}
console.log(resultof2());

//3. Print the given sequence 

let arr3 = [4,2,5,1,-0.5,-2,-3.5];
function resultof3() {
    for (var i = 0 ; i<=arr3.length-1;i++) {
        console.log(arr3[i]);
    }
}
console.log(resultof3());

//4.  Sigma

let sum = 0;
function resultof4() {
    for (var i = 0 ; i <=100;i++) {
        sum+=i;
    }
    console.log(sum);
}
console.log(resultof4());

//5.  Factorial

let multi = 1;
function resultof5() {
    for ( i = 1 ; i<=12;i++) {
        multi=multi*i;
    }
    console.log(multi);
}
console.log(resultof5());