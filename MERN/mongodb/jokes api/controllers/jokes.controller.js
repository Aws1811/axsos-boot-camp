const jokesModel = require("../models/jokes.models");

const findAllJokes = async (req, res) => {
    try {
        const allJokes = await jokesModel.find();
        return res.status(200).json({
            success: true,
            jokes: allJokes,
        });
    } catch (err) {
        return res.status(500).json({
            success: false,
            message: "could not retrive the jokes",
            err: err.message,
        });
    }
};

const findOneJoke = async (req, res) => {
    try {
        const singleJoke = await jokesModel.findById(req.params.id);
        if (!singleJoke) {
            return res.status(404).json({
                success: false,
                message: "didn't have a joke",
            });
        }
        return res.status(200).json({
            success: true,
            singleJoke: singleJoke,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "invalid jokes ID",
            err: err.message,
        });
    }
};

const createAJoke = async (req, res) => {
    try {
        const newJoke = await jokesModel.create(req.body);
        return res.status(201).json({
            success: true,
            message: "joke created successfully i guess",
            joke: newJoke,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "joke validation failed",
            err: err.message,
        });
    }
};

const updateAJoke = async (req, res) => {
    try {
        const changeJoke = await jokesModel.findByIdAndUpdate(
            req.params.id,
            req.body,
            {
                new: true,
                runValidators: true,
            },
        );
        if (!changeJoke) {
            return res.status(404).json({
                success: false,
                message: "joke not found",
            });
        }
        return res.status(200).json({
            success: true,
            message: "joke updated successfully",
            joke: changeJoke,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "could not upadte the joke .",
            err: err.message,
        });
    }
};

const deleteJoke = async (req, res) => {
    try {
        const theJokeThatDelete = await jokesModel.findByIdAndDelete(
            req.params.id,
        );
        if (!theJokeThatDelete) {
            return res.status(404).json({
                success: false,
                message: "joke not found",
            });
        }
        return res.status(200).json({
            success: true,
            message: "the joke was deleted successfuly",
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "the joke didnt delete successfuly",
            err: err.message,
        });
    }
};

module.exports = {
    findAllJokes,
    findOneJoke,
    createAJoke,
    updateAJoke,
    deleteJoke,
};
