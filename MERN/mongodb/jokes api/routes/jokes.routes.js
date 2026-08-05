const jokesController = require("../controllers/jokes.controller");

module.exports = (app) => {
    app.get("/api/jokes", jokesController.findAllJokes);
    app.get("/api/jokes/:id", jokesController.findOneJoke);
    app.post("/api/jokes/create", jokesController.createAJoke);
    app.patch("/api/jokes/update/:id", jokesController.updateAJoke);
    app.delete("/api/jokes/delete/:id", jokesController.deleteJoke);
};
