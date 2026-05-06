#  1-  countdown

def countdown(x):
    arr = []
    for i in range(x,-1,-1):
        arr.append(i)
    return arr
print(countdown(4))

# 2- print and return

def print_and_return(list):
    print(list[0])
    return list[1]
print(print_and_return([7,9]))

# 3- first plus length

def first_plus_length(list):
    return list[0] + len(list) 
print(first_plus_length([1,2,3,4,5,6,7,8,9,10]))

# 4- values greater thean second

def values_greater_than_second(list):
    rmz = []
    for i in range(len(list)):
        if list[i]>list[1]:
            rmz.append(list[i])
    if len(rmz)<=2:
        return False
    print(len(rmz))
    return rmz
print(values_greater_than_second([1,2,3,4,5,6,7,8,9,10]))

# 5- this length, that value

def this_length_that_value(x,y):
    eren = []
    for i in range(y):
        eren.append(x)
    return eren
print(this_length_that_value(7,9))