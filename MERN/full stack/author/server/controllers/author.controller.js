const authorModel = require("../models/author.model");

const createAuthor = async (req, res) => {
    try {
        const newAuthor = await authorModel.create(req.body);
        return res.status(201).json({
            success: true,
            message: "author created successfully",
            author: newAuthor,
        });
    } catch {
        return res.status(400).json({
            success: false,
            message: "author validation failed",
            err: err.message,
        });
    }
};

const findAllAuthors = async (req, res) => {
    try {
        const authors = await authorModel.find();
        return res.status(200).json({
            success: true,
            message: "all authors found correctly",
            authors,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "error fetching authors",
            err: err.message,
        });
    }
};

const findAuthor = async (req, res) => {
    try {
        const author = await authorModel.findById(req.params.id);
        return res.status(200).json({
            success: true,
            message: "author found correctly",
            author: author,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "error fetching author",
            err: err.message,
        });
    }
};

const updateAuthor = async (req, res) => {
    try {
        const author = await authorModel.findByIdAndUpdate(
            req.params.id,
            req.body,
            { new: true, runValidators: true },
        );
        return res.status(201).json({
            success: true,
            message: "author created successfully i guess",
            author: author,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "author validation failed",
            err: err.message,
        });
    }
};

const deleteAuthor = async (req, res) => {
    try {
        const author = await authorModel.findByIdAndDelete(req.params.id);
        return res.status(200).json({
            success: true,
            message: "author deleted",
            author: author,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "author failed",
            err: err.message,
        });
    }
};

module.exports = {
    createAuthor,
    findAllAuthors,
    findAuthor,
    updateAuthor,
    deleteAuthor,
};
