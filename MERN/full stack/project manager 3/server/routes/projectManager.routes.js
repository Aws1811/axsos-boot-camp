const projectManagerController = require("../controllers/projectManager.controller");

module.exports = (app) => {
    app.get("/api/project", projectManagerController.findAllProjects);
    app.post("/api/project", projectManagerController.createAProject);
    app.get("/api/project/:id", projectManagerController.findProject);
    app.put("/api/project/:id", projectManagerController.updateProject);
    app.delete("/api/project/:id", projectManagerController.deleteProject);
};
