import random
def randInt(min=0 , max=100):
    if max<0:
        return False
    if min>max:
        return False
    i = round(random.random() * (max-min)+min)
    return i
print(randInt())
print(randInt(max=50))
print(randInt(min=50))
print(randInt(min=50, max=500))