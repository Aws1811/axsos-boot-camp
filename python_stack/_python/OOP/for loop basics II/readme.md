# for loop basic II

-

## Functions

| Function | Description |
|---|---|
| `biggie_size(lst)` | Replaces all positive numbers with `"big"` |
| `count_positives(lst)` | Replaces last element with count of positive numbers |
| `sum_total(lst)` | Returns the sum of all values |
| `average(lst)` | Returns the average of all values |
| `length(lst)` | Returns the length of the list |
| `minimum(lst)` | Returns the minimum value, or `False` if empty |
| `maximum(lst)` | Returns the maximum value, or `False` if empty |
| `ultimate_analysis(lst)` | Returns a dictionary with full list statistics |
| `reverse_list(lst)` | Reverses the list in-place |

## Examples

```python
biggie_size([-1, 3, 5, -5])       # [-1, "big", "big", -5]
count_positives([-1, 1, 1, 1])    # [-1, 1, 1, 3]
sum_total([1, 2, 3, 4])           # 10
average([1, 2, 3, 4])             # 2.5
length([37, 2, 1, -9])            # 4
minimum([37, 2, 1, -9])           # -9
maximum([37, 2, 1, -9])           # 37
ultimate_analysis([37, 2, 1, -9]) # {'sumTotal': 31, 'average': 7.75, 'minimum': -9, 'maximum': 37, 'length': 4}
reverse_list([37, 2, 1, -9])      # [-9, 1, 2, 37]
```
