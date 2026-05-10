# 1- biggie size

def biggie_size(list):
    for i in range(len(list)):
        if list[i]>0:
            list[i] = "big"
    return list
print(biggie_size([1,2,3,4,-1,-2]))

# 2- count positives 

def count_positives(list):
    s = 0
    for i in range(len(list)):
        if list[i]>0:
            s = s+1
    list[len(list)-1] = s
    return list
print(count_positives([1,2,-1,4,5]))

# 3- sum total 

def sum_total(list):
    result = 0
    for i in range(len(list)):
        result = result +list[i]
    return result
print(sum_total([5,0,9,1,2,3,5,6]))

# 4- average 

def average(list):
    avg = 0
    result = 0
    for i in range(len(list)):
        avg = avg + list[i]
    result = avg / len(list)
    return result
print(average([1,2,3,4]))

# 5- length

def length(list):
    return len(list)
print(length([1,2,3,4,5,6]))

# 6- minumum

def minumum(list):
    
    if list == []:
        return False
    for i in range(len(list)):
        min = list[0]
        if min>list[i]:
            min =list[i]
            return min
print(minumum([2,1,2,3,4,5,6]))

# 7- maximum

def maximum(list):
    if list ==[]:
        return False
    for i in range(len(list)):
        max = list[0]
        if max<list[i]:
            max = list[i]
            return max 
print(maximum([9,1,7,6,51,8,-1,-3,19,14]))

# 8- ultimate analysis

def ultimate_analysis(list):
    result = 0
    max = list[0]
    min = list[0]
    for i in range(len(list)):
        result = result +list[i]
        if max<list[i]:
            max = list[i]
        if min>list[i]:
            min = list[i]
    avg = result/len(list)
    ult = {'sum_total':result,'minumum':min , 'maximum':max , 'avg':avg,'length':len(list)}
    return  ult
print(ultimate_analysis([1,-1,2,-3,32,4,6]))

# 9- reverse list

def reverse_list(list):
    temp =0
    for i in range(int(len(list)/2)):
        temp =list[len(list)-1-i]
        list[len(list)-1-i] = list[i]
        list[i] = temp
    return list
print(reverse_list([1,2,3,4,5,6,7,8,9,10]))