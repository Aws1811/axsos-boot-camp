class Bank_account:
    def __init__(self , int_rate = 0 , balance = 0):
        self.int_rate = int_rate
        self.balance = balance

    def deposit(self,amount):
        self.balance += amount
        return self

    def withdraw(self,amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("insufficient funds: charging a 5$ fee")
            self.balance -= 5
        return self
    
    def display(self):
        print(f"rate {self.int_rate}% ; balance {self.balance}$")
        return self

    def yield_intrest(self):
        if self.balance > 0:
            self.balance += self.balance * self.int_rate
        return self

acc1 = Bank_account(0.1 , 200)
acc2 = Bank_account(0.4 , 400)

acc1.deposit(60).deposit(80).deposit(50).withdraw(90).yield_intrest().display()
acc2.deposit(200).deposit(180).withdraw(50).withdraw(120).withdraw(5).withdraw(90).yield_intrest().display()
