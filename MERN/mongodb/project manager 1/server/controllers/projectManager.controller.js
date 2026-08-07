const projManaModel = require("../models/projectManager.models");


const createAProject = async (req, res) => {
    try {
        const newProject = await projManaModel.create(req.body);
        return res.status(201).json({
            success: true,
            message: "project created successfully i guess",
            project: newProject,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "project validation failed",
            err: err.message,
        });
    }
};

module.exports={
    createAProject,
}