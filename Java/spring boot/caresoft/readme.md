# Clinic App

## Preview
No photos provided for this assignment.

## Run the app
```
# 1. navigate to the project folder
cd Desktop\axsos\Java\spring boot\caresoft\src\com\caresoft\clinicapp

# 2. compile all files
javac User.java HIPAACompliantUser.java HIPAACompliantAdmin.java Physician.java AdminUser.java Test.java

# 3. run the program
java com.caresoft.clinicapp.Test
```
Then check your console for the test results.

## Built With
- [Java](https://www.java.com/) — programming language

## Features
- Create a base User class with a shared ID and PIN
- Define HIPAA compliance rules through two interfaces: HIPAACompliantUser and HIPAACompliantAdmin
- Extend User with a Physician class that implements pin validation and access authorization
- Extend User with an AdminUser class that implements both HIPAA interfaces
- Log and report failed authorization attempts as security incidents
- Run pass/fail tests on pin assignment and access authorization for both Physician and AdminUser