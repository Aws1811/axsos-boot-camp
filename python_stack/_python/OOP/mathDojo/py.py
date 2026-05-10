class MathDojo:
    def __init__(self):
        self.result = 0

#  for the *nums its a tuples so we need to make for loop for it

    def add(self, num, *nums):
        self.result+= num
        for i in range(len(nums)):
            self.result+= nums[i]
            print(self.result , "this is  the changes" , i)
        return self
    
    def subtract(self, num, *nums):
        self.result -= num
        for i in range (len(nums)):
            self.result -=nums[i] 
        return self        

# create an instance:

md = MathDojo()
# to test:

x = md.add(2).add(2,5,1).subtract(3,2).result
print(x)    # should print 5

y = md.add(9,5,6,7,8,2,1).add(8,7,6,3,1,1,4).subtract(9,6,2,1,1,1).subtract(8,7,6,1).result
print( "this is the final answer" , y)
# run each of the methods a few more times and check the result!

