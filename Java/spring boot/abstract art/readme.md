# Abstract Art

## Preview
No photos provided for this assignment.

## Run the app
```
# 1. navigate to the project folder
cd abstract artt\src\com\axsos\springboot\abstrac

# 2. compile all files
javac Art.java Painting.java Sculpture.java Museum.java

# 3. run the program
java com.axsos.springboot.abstrac.Museum
```
Then check your console for the art display output.

## Built With
- [Java](https://www.java.com/) — programming language

## Features
- Define a base abstract Art class with a title, author, description, and an abstract viewArt method
- Extend Art with a Painting class that adds a paint type and implements viewArt
- Extend Art with a Sculpture class that adds a material and implements viewArt
- Create and display paintings and sculptures inside a Museum main class