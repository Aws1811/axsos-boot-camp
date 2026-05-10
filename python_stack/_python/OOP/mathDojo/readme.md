#  MathDojo — Python OOP Assignment

A simple Python class that performs math operations with method chaining and flexible arguments.

---

##  Usage

```python
md = MathDojo()
x = md.add(2).add(2,5,1).subtract(3,2).result
print(x)  # 5
```

---

##  Methods

| Method | Description |
|---|---|
| `add(num, *nums)` | Adds one or more numbers to result |
| `subtract(num, *nums)` | Subtracts one or more numbers from result |

---
