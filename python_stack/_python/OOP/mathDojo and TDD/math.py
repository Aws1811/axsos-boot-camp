# first we import the text case
import unittest

# the class prvided by importing it gives us the methods
class Thetest(unittest.TestCase):
    def setUp(self):
        print("running setup")
        #  here is for refreshing the test
        self.md = MathDojo()
        
    # for test the result
    def test_equal(self):
        x = self.md.add(5,5,6,4).subtract(1,3,4,1).add(8,8,7,6).subtract(8,1,4,3).result
        self.assertEqual(x,24)


    def test(self):
        # for test the positivity
        self.assertTrue(self.md.isPositive(3,3,3))
        self.assertFalse(self.md.isPositive(3,3,-3))

# this runs after each test and its for refreshing
    def tearDown(self):
        print("running tearDown tasks")
    
 # the class of math 
class MathDojo:

    def __init__(self):
        self.result = 0

    def add(self,num ,*nums):
        self.result += num
        for i in range(len(nums)):
            self.result += nums[i]
        return self

    def subtract(self,num,*nums):
        self.result -= num
        for i in range(len(nums)):
            self.result-=nums[i]
        return self
    
    def isPositive(self,num,*nums):
        if num <0:
            return False

        for i in range(len(nums)):
            if nums[i]<0:
                return False
        return True

md = MathDojo()

x = md.add(5,5,6,4).subtract(1,3,4,1).add(8,8,7,6).subtract(8,1,4,3).result
print(x)



if __name__ == "__main__":
    unittest.main()