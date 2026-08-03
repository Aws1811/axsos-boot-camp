app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const express = require("express");
const app = express();
const port = 8000;
app.get("/api", (request, response) => {
    response.json({ message: "the world is nice" });
});
app.listen(port, () => console.log("wowoo"));
