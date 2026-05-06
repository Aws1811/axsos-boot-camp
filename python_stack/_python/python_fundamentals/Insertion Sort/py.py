def insert_sort(num):
    for i in range(1 , len(num)):
        ins =i
        val = num.pop(i)
        for j in range(i-1,-1,-1):
            if num[j] > val:
                ins = j
        num.insert(ins,val)
    return num
print(insert_sort([9,7,6,4,3,2,1,5,8,10]))