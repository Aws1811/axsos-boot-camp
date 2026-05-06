# basic : form 0 to 150

for basic in range(0,151,1):
    print(basic)

#all number multiplay by 5 

for multi in range(5 ,1001 , 5):
    print(multi)

# print to 100 but if the intger divsple by 5 print coding and 10 print 10

for count in range(1 , 101 ,1):
    if count%10 == 0:
        print("coding dojo")
    elif count%5 == 0:
        print("coding")
    else:
        print(count)

# find the sum of the big number

sum =0
for whoa in range(0 ,500000 ,1):
    if whoa%2 !=0:
        sum = sum+1
print (sum)

# count descounding

for down in range(2018 , 0 ,-4):
    print(down)

#  many varubles  and how to use them

lowNum = 4
highNum = 400
mult = 8
for flex in range(lowNum , highNum , 1):
    if flex%mult == 0:
        print(flex)