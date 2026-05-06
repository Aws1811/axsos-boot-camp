#  Underscore.py

A custom Python library inspired by the JavaScript [Underscore.js](https://underscorejs.org/) library — built using callbacks and lambda functions.

---

##  About

This project recreates 4 core methods from Underscore.js as a Python class. It was built to practice:

- ✅ Callbacks (passing functions as arguments)
- ✅ Anonymous functions (lambdas)
- ✅ Building a custom Python class/module

---

## 🚀 Usage

```python
_ = Underscore()

_.map([1, 2, 3], lambda x: x * 2)
# → [2, 4, 6]

_.find([1, 2, 3, 4, 5, 6], lambda x: x > 4)
# → 5

_.filter([1, 2, 3, 4, 5, 6], lambda x: x % 2 == 0)
# → [2, 4, 6]

_.reject([1, 2, 3, 4, 5, 6], lambda x: x % 2 == 0)
# → [1, 3, 5]
```

---

## 🛠️ Methods

| Method | Description |
|--------|-------------|
| `map(iterable, callback)` | Applies callback to every element, returns new list
| `find(iterable, callback)` | Returns the first element that satisfies the condition 
| `filter(iterable, callback)` | Returns all elements that pass the condition 
| `reject(iterable, callback)` | Returns all elements that fail the condition 

---



##  Key Concepts Learned

- **Callbacks** — passing a function as an argument to another function
- **Lambda functions** — writing anonymous one-line functions (`lambda x: x * 2`)
- **Iteration** — looping through lists and applying logic to each element
- **OOP basics** — organizing methods inside a Python class

---

##  No dependencies

Pure Python — no libraries needed.