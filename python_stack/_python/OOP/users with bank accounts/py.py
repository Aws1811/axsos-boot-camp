# bank accout class where we do the calculating
class BankAccount:
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

# user class here where we reavel the accounts and the user balance

class User:
# make the init values
    def __init__(self, name):
        self.name = name
        self.account = []

# here for let the user  make more than one account

    def new_account(self ,init_rate  ,balance ):
        self.account.append(BankAccount(init_rate , balance))
        return self

# deposit from the bank account class to make the calculate

    def plus_money(self, amount , account_num = 0):
        self.account[account_num].deposit(amount)
        return self

# withdraw from the bank account class to make the calculate


    def make_withdrawal(self, amount,account_num = 0):
        self.account[account_num].withdraw(amount)
        return self


    def display_user_balance(self,account_num=0):
        print(f"User: {self.name}, account {account_num} , Balance: ${self.account[account_num].balance}")
        # return self

    def display_all_users(self):
        for i in range(len(self.account)):
            print(self.display_user_balance(i))

# the test case
user1 = User("Guido van Rossum")
print("user1 =",user1)
user1.new_account(0.4, 200).new_account(0.8, 400).new_account(0.1, 100)
user1.plus_money(50 , 0).plus_money(100 , 2).plus_money(25 , 2).make_withdrawal(75,1)
user1.display_user_balance(0)
user1.display_user_balance(1)
user1.display_user_balance(2)
user1.display_all_users()

