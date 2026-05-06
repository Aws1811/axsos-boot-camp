def select_sort(num):
    for i in range(len(num)-1):
        min = i
        for j in range(i+1 , len(num)):
            if num[j]<num[min]:
                min =j
        mins = num.pop(min)
        num.insert(i,mins)
    return num
print(select_sort(num= [5,6,7,1,3,8,9,2,4,10]))