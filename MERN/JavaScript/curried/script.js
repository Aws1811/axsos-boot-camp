
// this code is just an example.

function multiply(a){
  return function(b){
    return a * b;
  }
}

const double = multiply(2);
console.log(double(5)); // 10
console.log(multiply(3)(4)); // 12

// conclusion:- so basicly we could call a function doubly by return the function inside the function.