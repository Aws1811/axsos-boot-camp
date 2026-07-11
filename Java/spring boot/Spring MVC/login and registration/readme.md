#   login and regiester

### Review
[▶ Watch the review](https://drive.google.com/file/d/1M52Zt8oKPu6yWt_oovaQ2XYtDvgw6v-Y/view?usp=sharing)

## Run the app
```
# 1. navigate to the project folder
cd Desktop\axsos\Java\spring boot\studentrostar

# 2. build and run the Spring Boot app
./mvnw spring-boot:run
```
Then open your browser at: `http://localhost:8080`

## Built With
- [Java](https://www.java.com/) — programming language
- [Spring Boot](https://spring.io/projects/spring-boot) — Java web framework
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) — database ORM layer
- [JSP](https://www.oracle.com/java/technologies/jspt.html) — Java Server Pages for HTML templating

## Features
- Register a new user with username, email, country, gender, birthday, programming languages, and password
- Validate all registration inputs and display error messages for invalid entries
- Log in with email and password and maintain the session until logout
- Display a personalized user dashboard after login
- Display all dorms with the total count
- Add a new dorm with a name via a dedicated form
- Delete a dorm directly from the dorms page
- View a dorm's detail page showing all assigned students
- Add a new student and assign them to a dorm via a dropdown
- Assign an existing student to a dorm from the dorm detail page
- Remove a student from a dorm
- One-to-many relationship between Dorms and Students