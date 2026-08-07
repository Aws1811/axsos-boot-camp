const projectManagerController = require("../controllers/projectManager.controller")

module.exports = (app) =>{
    app.post("/api/project/create",projectManagerController.createAProject);
}