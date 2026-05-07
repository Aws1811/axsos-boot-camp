# User:- Python OOP

A simple banking system built with Python using OOP concepts for specfiying the user and what can he access.

---

## Concepts Used
- Classes & Objects
- Constructor (`__init__`)
- Instance Methods
- Method Chaining (every method returns `self`)
- Default Parameters

---


## 💡 Example

```python
user1 = User("Guido", 100)
user1.plus_money(50).make_withdrawal(30).display_user_balance()
# Output: User: Guido, Balance: $120
```