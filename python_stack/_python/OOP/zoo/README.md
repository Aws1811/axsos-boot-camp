#  Zoo - Python OOP Assignment

A virtual zoo simulation built with Python,using inheritance, polymorphism, overriding, and class associations.

---

##  Objectives

- Practice using **inheritance**
- Practice **associations** between classes
- Practice **overriding methods**
- See **polymorphism** in action

---


### `Animal` (Base Class)
The foundation for all animals in the zoo.

| Attribute | Default | Description |
|---|---|---|
| `name` | required | Animal's name |
| `age` | 1 | Animal's age |
| `health_level` | 100 | Current health |
| `hapiness_level` | 100 | Current happiness |

**Methods:**
- `feed()` — increases health and happiness by **+10** + the number in each animal 
- `display_info()` — prints name, age, health, and happiness

---

### `Crow` `Fox` `Elephant` (extends `Animal`)

**Extra attribute:-** 
`crow: special_wings` ( default `False`)
`Elephant: trunk length` (default `10 m`)
`Fox : talis number` (default `1 tail`)

---

### `Zoo`
Manages a collection of animals.

| Method | Description |
|---|---|
| `add_crow(name)` | Adds a Crow to the zoo |
| `add_fox(name)` | Adds a Fox to the zoo |
| `add_elephant(name)` | Adds an Elephant to the zoo |
| `print_all_info()` | Displays info for all animals |

---


## 👨‍💻 Authors

Made by **Chaker** and **Aws**
