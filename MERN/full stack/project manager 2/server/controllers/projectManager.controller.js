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

const findAllProjects = async (req, res) => {
    try {
        const projects = await projManaModel.find();
        return res.status(200).json({
            success: true,
            message: "all projects found correctly",
            projects,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "error fetching projects",
            err: err.message,
        });
    }
};

const findProject = async (req, res) => {
    try {
        const project = await projManaModel.findById(req.params.id);
        return res.status(200).json({
            success: true,
            message: "project found correctly",
            project:project
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "error fetching project",
            err: err.message,
        });
    }
};

module.exports = {
    createAProject,
    findAllProjects,
    findProject,
};
