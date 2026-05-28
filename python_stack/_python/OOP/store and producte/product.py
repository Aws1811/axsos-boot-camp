class Product:
    def __init__(self,name , price , category):
        self.name = name
        self.price = price
        self.category = category
    
    def update_price(self,percent_change , is_increased):
        if is_increased:
            self.price += percent_change
        else :
            self.price -= percent_change
        return self.price
    
    def print_info(self):
        print(f"the product you want with the name {self.name} in {self.category} have value of {self.price}")