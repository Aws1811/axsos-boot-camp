# Card Classes


## Run the app
Open the file in your browser console or run it with Node.js:
```
node card.js
```

## Built With
- [JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript) — programming language

## Features
- Create a base Card class with a name and cost
- Extend Card with a Unit class representing a soldier with power and resistance stats
- Allow a Unit to attack another Unit, reducing the target's resistance by the attacker's power
- Extend Card with an Effect class that modifies a Unit's power or resistance by a given magnitude
- Validate that an Effect can only be played on a Unit, throwing an error otherwise
- Log a message indicating whether the stat was increased or decreased

> Test cases for these classes are covered in the next assignment: **Its Time to Duel**