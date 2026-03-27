// 1. always hungry

function alwaysHungry(arr) {
    for(var i =0;i<arr.length;i++){
        if(arr[i]==="food"){
            console.log("yummy");
        }
        
    }
    if(arr.includes("food")===false){
        console.log("I'm hungery");
    }
}alwaysHungry([4, 1, 5,5, 2]);

//2.high pass filter
function highPass(arr,cutoff){
    var filteredArr= [];
    for(var i =0;i<arr.length;i++){
        if(arr[i]>cutoff){
            filteredArr.push(arr[i]);
        }
    }
return filteredArr
}var result = highPass([6,8,3,10,-2,5,9],5);
console.log(result);

// 3. Better than average
function betterThanAverage(arr){
    var sum=0;
    var count  = 0 ;
    var arrl=arr.length;
    for(var i = 0;i<arr.length;i++){
        sum+=arr[i];
    }
    var avg = sum/arrl;
    for(var i=0;i<arr.length;i++){
        if(avg<arr[i]){
            count++;
        }
    }

    return count;
}var result = betterThanAverage([6,8,4,10,-2,5,9]);
console.log(result);

// 4. Array Reverse

function reverse(arr){
    var yor=[];
    var temp = arr.length;
    for(var i = 0 ;i<temp;i++){
        yor.push(arr.pop());
    }
    return yor;
}
var result = reverse(['a','b','c','d','e']);
console.log(result);

// 5. Fibonacci Array

function fibonacciArray (n){
    var fibArr = [0,1]
    for(var i =0;i<=n-3;i++){
        fibArr.push(fibArr[i]+fibArr[i+1]);
    }

    return fibArr;

}
var result = fibonacciArray(18);
console.log(result);