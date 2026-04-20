"use strict";
class User {
    firstName;
    lastName;
    address;
    phoneNumber;
    constructor(firstName, lastName, address, phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    // Getters and Setters
    getFirstName() {
        return this.firstName;
    }
    setFirstName(fName) {
        this.firstName = fName;
    }
    getLastName() {
        return this.lastName;
    }
    setLastName(lName) {
        this.lastName = lName;
    }
}
// اختبار الكلاس
const user = new User("Ahmed", "Ali", "Ramallah", 1599123456);
console.log(user.getFirstName()); // Ahmed
console.log(user.getLastName()); // Ali
user.setFirstName("Mohammed");
console.log(user.getFirstName()); // Mohammed
