const express = require("express");
const app = express();
const port = 8000;
app.get("/api", (request, response) => {
    response.json({ message: "aws is nice" });
});
app.listen(port, () => console.log("wowoo"));
