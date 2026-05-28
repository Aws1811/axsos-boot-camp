from product import Product
class Store:
    def __init__(self , name ):
        self.name = name
        self.list = []
        
    
    def add_product(self,new_product):
        self.list.append(new_product)
    
    def sell_product(self,id):
        product  = self.list.pop(id)
        product.print_info()
        
    
    def inflation(self,percent_increase):
        for i in range(len(self.list)):
            self.list[i].update_price(percent_change = percent_increase , is_increased = True)

    def set_clearance(self,category,percent_discount):
        for i in range(len(self.list)):
            if category == self.list[i].category:
                self.list[i].update_price(percent_change = percent_discount , is_increased = False)

