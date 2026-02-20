//Fundamentals To Do 1//

//setting and swaping//

var mynumber = 42;
var myname = 'aws';
console.log(mynumber);
console.log(myname);
var temp = 0;
temp = mynumber ;
mynumber = myname;
myname = temp;
console.log(mynumber);
console.log(myname);

//PRINT-52 TO 1066// 

function printnum(){
    for(var i = -52 ; i<=1066;i++){
        console.log(i);
    }
}
console.log(printnum());

//dONT WORRY,BE HAPPY//
var s = 'good morning!'
function becheerful(){
    for(var i=0 ; i<=98 ; i++){
        console.log(s);
    }
}
console.log(becheerful());

//MULTIPLES OF THREE - BUT NOT ALL//

function multi3(){
    for(var i = -300 ; i<=0; i++){
        if (i != -6){
            if (i != -3){
                if (i % 3 == 0){
                    console.log(i);
                }
            }
        }
    }
}
console.log(multi3());
//or i can use this insted//
if (i!=-3 && i!=-6 && i%3 == 0){
}

//PRINTING INTEGERS WITH WHILE//
function integers(){
    var i = 2000;
    while (i<=5280){
        console.log(i);
        i++
    }
}
console.log(integers());

//YOU SAW ITS YOUR BIRTHDAY//
var s = 'how did u know';
var d = 'Try another Day';
function BIRTHDAY (){
    for(var i = 1 ; i<= 31 ; i++){
        for(var j = 1;j <= 12 ; j++){
            if( i == 29 && j == 1){
                console.log(s);
            } else {
                console.log(d);
            }
        }
    }
}
console.log(BIRTHDAY());
//or for no looping// 
var s = 'how did u know';
var d = 'Try another Day';

function BIRTHDAY(day, month) {
    if (day == 29 && month == 1) {
        console.log(s);
    } else {
        console.log(d);
    }
}

//leap year//
var s = 'leap year'
var a = 'not a leap year'
function LeapYear(Y){
    if(Y%4 == 0){
        console.log(s);
        if(Y % 100 == 0 && Y%400 != 0){
            console.log(a);
        } 
    }
}
console.log (LeapYear());

//print and count//

var s = 0 ;
function count(){
    for(var i = 512 ;i<=4096;i++){
        if(i % 5 == 0){
            console.log(i);
            s++;
        }
    }
    console.log(s);
}
console.log(count());

//multiples of six//

function six(){
    var i = 6;
    while (i % 6 == 0 && i<=60000){
        console.log(i);
        i=i+6;
    }
}
console.log(six());

//counting the dojo way//

var s = 'coding';
var d = 'codingdojo';
var flag = false;
function codedojo(){
    for (var i = 1; i<=100 ; i++){
        if(i % 10 == 0){
            console.log(d);
            flag = true
        }else if(i % 5== 0){
            console.log(s);
            flag = true;
        }
        if(!flag){
            console.log(i);
        }
        flag = false;
    }
}
console.log(codedojo());

//what do u know//

function sh(incoming){
    console.log(incoming);

}
sh();


//whoa that sucker huge//
var sum=0;
function root(){
    for(var i=-300000;i<=300000;i++){
        if(i%2 != 0){
            sum+=i;
        }
    }
    console.log(sum);
}

console.log(root());

//countdown by fours//
function oooo(){
    var i =2016;
    while (i>0){
        console.log(i);
        i=i-4;
    }
}
console.log(oooo());

//flexible countdown//
var s=[];
function multi(){
    for(var i =9;i>=2;i--){
        if(i % 3 == 0){
            console.log(i);
        }
    }
}
console.log(multi());

//The final countdown//

function final(param1,param2,param3,param4){
    var i = 1;
    if ("1" === true)
        console.log("ture")
    while(i*param1<=param3){
        if(i*param1>= param2 && i*param1 != param4){
            var mu = i*param1
            console.log(mu)
        }
        i++;
    }
}
console.log(final(5,20,100,25));
