# randInt Function

## Description
A custom function that generates a random integer between a given `min` and `max` value using Python's `random` module.

---

## Function

```python
import random

def randInt(min=0, max=100):
    if max < 0:
        return False
    if min > max:
        return False
    i = round(random.random() * (max - min) + min)
    return i
```

---

## Returns
- A **random integer** between `min` and `max`
- `False` if `max < 0`
- `False` if `min > max`

---

## Usage Examples

```python
print(randInt())                   # random int between 0 and 100
print(randInt(max=50))             # random int between 0 and 50
print(randInt(min=50))             # random int between 50 and 100
print(randInt(min=50, max=500))    # random int between 50 and 500
```
