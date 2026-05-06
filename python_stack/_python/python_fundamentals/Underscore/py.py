class Underscore:
    # map => to multiply numbers by 2 ,Applies callback to every element, returns new list.
    def map(self, iterable, callback):
        arr = []
        for i in range(len(iterable)):
            arr.append(callback(iterable[i]))
        return arr
    # find => num bigger than 4 ,Returns the first element that satisfies the condition.
    def find(self, iterable, callback):
        for i in range(len(iterable)):
            if callback(iterable[i]) == True:
                return iterable[i]
    # filter => find even number,Returns all elements that pass the condition
    def filter(self, iterable, callback):
        arr =[]
        for i in range(len(iterable)):
            if callback(iterable[i]) == True:
                arr.append(iterable[i])
        return arr
    # reject => find odd numbers,Returns all elements that fail the condition
    def reject(self, iterable, callback):
        arr =[]
        for i in range(len(iterable)):
            if callback(iterable[i]) == False:
                arr.append(iterable[i])
        return arr

_ = Underscore()
multi = _.map([1,2,3],lambda x:x*2)
big = _.find([-2,2,4,6,8],lambda x:x>4)
filt =_.filter([1,2,3,4,5,6],lambda x:x % 2 == 0)
rej = _.reject([1,2,3,4,5,6], lambda x: x % 2 == 0)
print(multi)
print(big)
print(filt)
print(rej)  
# evens = _.filter([1, 2, 3, 4, 5, 6], lambda x: x % 2 == 0)