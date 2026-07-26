
// this code is just an example.

function createBankAccount(startingBalance){
  let balance = startingBalance;

  function deposit(amount){
    balance += amount;
    console.log(`Deposited ${amount}. New balance: ${balance}`);
  }

  function withdraw(amount){
    balance -= amount;
    console.log(`Withdrew ${amount}. New balance: ${balance}`);
  }

  return { deposit, withdraw };
}

const myAccount = createBankAccount(100);
myAccount.deposit(50);  // Deposited 50. New balance: 150
myAccount.withdraw(30); // Withdrew 30. New balance: 120

console.log(balance); //  still not accessible , it's private, protected by the closure


// conclusion:- we can access the function that inside another function to show them or use them 
// BUT we cant change the things inside it or reveal its data like its variables ,cuz they will dissaper after we end the function .