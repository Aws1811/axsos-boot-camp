# Zoo Keeper

## Preview
No photos provided for this assignment.

## Run the app
```
# 1. navigate to the project folder
cd src\com.axsos.oop.zookeeper

# 2. compile all files
javac Mammal.java Gorila.java Bat.java AnimalTest.java

# 3. run the program
java com.axsos.oop.zookeeper.AnimalTest
```
Then check your console for each animal's energy updates.

## Built With
- [Java](https://www.java.com/) — programming language

## Features
- Create a base Mammal class with an energy level and shared getters, setters, and display method
- Extend Mammal with a Gorilla class and a Bat class using inheritance
- Drain and restore the Gorilla's energy through throwing, climbing, and eating bananas
- Drain and restore the Bat's energy through flying, attacking a town, and eating
- Cap energy at its maximum value and floor it at zero to prevent invalid states
- Display the current energy level for any animal