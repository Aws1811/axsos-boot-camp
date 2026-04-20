class User {
    private firstName: string;
    private lastName: string;
    private address: string;
    private phoneNumber: number;

    constructor(
        firstName: string,
        lastName: string,
        address: string,
        phoneNumber: number
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public getFirstName(): string {
        return this.firstName;
    }

    public setFirstName(fName: string): void {
        this.firstName = fName;
    }

    public getLastName(): string {
        return this.lastName;
    }

    public setLastName(lName: string): void {
        this.lastName = lName;
    }
}

// اختبار الكلاس
const user = new User("Ahmed", "Ali", "Ramallah", 1599123456);

console.log(user.getFirstName()); // Ahmed
console.log(user.getLastName());  // Ali

user.setFirstName("Mohammed");
console.log(user.getFirstName()); // Mohammed