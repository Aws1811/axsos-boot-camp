# function basics II

-

## Functions

| Function | Description |
|---|---|
| `countdown(n)` | Returns a list counting down from n to 0 |
| `print_and_return(lst)` | Prints the first value and returns the second |
| `first_plus_length(lst)` | Returns first value + length of the list |
| `values_greater_than_second(lst)` | Returns values greater than the 2nd element |
| `length_and_value(size, value)` | Returns a list of given size filled with given value |

## Examples

```python
countdown(5)                          # [5, 4, 3, 2, 1, 0]
print_and_return([1, 2])              # prints 1, returns 2
first_plus_length([1, 2, 3, 4, 5])   # 6
values_greater_than_second([5,2,3,2,1,4])  # prints 3, returns [5, 3, 4]
values_greater_than_second([3])       # False
length_and_value(4, 7)               # [7, 7, 7, 7]
length_and_value(6, 2)               # [2, 2, 2, 2, 2, 2]
```

