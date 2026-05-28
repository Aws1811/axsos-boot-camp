from product import Product
from store import Store


store = Store("aws store")
banana = Product("banana",4 ,"food")
apple  = Product("apple",5 , "food")
boss_tshirt = Product("boss t-shirt",50 , "clothes")
newland = Product("newland",50 , "clothes")
store.add_product(boss_tshirt)
store.add_product(newland)
store.add_product(banana)
store.add_product(apple)
store.inflation(9)
store.set_clearance("clothes",8)
for i in range(len(store.list)):
    store.sell_product(0)

