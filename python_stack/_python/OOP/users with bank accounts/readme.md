#  Users with Bank Accounts — Python OOP Assignment

A Python project practicing **class associations** by linking a `User` class to a `Bank_account` class.

---

##  Features

- User owns one or multiple bank accounts
- Deposit & withdraw from specific accounts
- Insufficient funds fee ($5 charge)
- Method chaining support
- ⭐ SENSEI BONUS: multiple accounts per user

---

## 🧱 Classes

### `Bank_account`
| Method | Description |
|---|---|
| `deposit(amount)` | Adds amount to balance |
| `withdraw(amount)` | Deducts amount or charges $5 fee |
| `yield_interest()` | Adds `balance × int_rate` to balance |
| `display()` | Prints rate and balance |

### `User`
| Method | Description |
|---|---|
| `new_account(int_rate, balance)` | Creates and adds a new bank account |
| `plus_money(amount, account_num)` | Deposits into specified account |
| `make_withdrawal(amount, account_num)` | Withdraws from specified account |
| `display_user_balance(account_num)` | Prints user name and account balance |

---

