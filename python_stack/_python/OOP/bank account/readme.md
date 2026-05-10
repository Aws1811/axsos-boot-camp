# BankAccount — Python OOP Assignment
 
A simple Python class simulating a bank account with deposits, withdrawals, and interest.
 
---
 
## Features
 
- Deposit & withdraw money
- Insufficient funds fee ($5 charge)
- Yield interest on positive balance
- Method chaining support
---
 
## Usage
 
```python
acc = Bank_account(int_rate=0.1, balance=200)
acc.deposit(100).withdraw(50).yield_interest().display()
# Output: rate 0.1% ; balance 275.0$
```
 
---
 
## Methods
 
| Method | Description |
|---|---|
| `deposit(amount)` | Adds amount to balance |
| `withdraw(amount)` | Deducts amount or charges $5 fee |
| `yield_interest()` | Adds `balance × int_rate` to balance |
| `display()` | Prints current rate and balance |
 
---
 