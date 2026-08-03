const express = require("express");
const { faker } = require("@faker-js/faker");

const app = express();
const PORT = 8000;

// Helper to generate a random user
const createUser = () => {
    return {
        _id: faker.string.uuid(),
        firstName: faker.person.firstName(), // Fixed: internet.firstName is deprecated
        lastName: faker.person.lastName(), // Fixed: internet.lastName is deprecated
        email: faker.internet.email(),
        password: faker.internet.password(),
        phoneNumber: faker.phone.number(),
    };
};

// Helper to generate a random company
const createCompany = () => {
    return {
        _id: faker.string.uuid(),
        CompanyName: faker.company.name(),
        address: {
            street: faker.location.street(),
            city: faker.location.city(),
            state: faker.location.state(),
            zipCode: faker.location.zipCode(),
            country: faker.location.country(),
        },  
    };
};

// API Routes
app.get("/api/GET/users/new", (req, res) => {
    const newUser = createUser();
    res.status(200).json({ user: newUser });
});

app.get("/api/GET/companies/new", (req, res) => {
    const newCompany = createCompany();
    res.status(200).json({ company: newCompany });
});

app.get("/api/GET/user/company", (req, res) => {
    const newCompany = createCompany();
    const newUser = createUser();
    res.status(200).json({ company: newCompany, user: newUser });
});

// Start Server
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
