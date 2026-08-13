const playerModel = require("../models/player.model");

const createPlayer = async (req, res) => {
    try {
        const newPlayer = await playerModel.create(req.body);
        return res.status(201).json({
            success: true,
            message: "player created successfully",
            player: newPlayer,
        });
    } catch(err) {
        return res.status(400).json({
            success: false,
            message: "player validation failed",
            err: err.message,
        });
    }
};

const findAllPlayers = async (req, res) => {
    try {
        const players = await playerModel.find();
        return res.status(200).json({
            success: true,
            message: "all players found correctly",
            players,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "error fetching players",
            err: err.message,
        });
    }
};

const findPlayer = async (req, res) => {
    try {
        const player = await playerModel.findById(req.params.id);
        return res.status(200).json({
            success: true,
            message: "player found correctly",
            player: player,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "error fetching player",
            err: err.message,
        });
    }
};

const updatePlayer = async (req, res) => {
    try {
        const player = await playerModel.findByIdAndUpdate(
            req.params.id,
            req.body,
            { new: true, runValidators: true },
        );
        return res.status(201).json({
            success: true,
            message: "player created successfully i guess",
            player: player,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "player validation failed",
            err: err.message,
        });
    }
};

const deletePlayer = async (req, res) => {
    try {
        const player = await playerModel.findByIdAndDelete(req.params.id);
        return res.status(200).json({
            success: true,
            message: "player deleted",
            player: player,
        });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "player failed",
            err: err.message,
        });
    }
};

const updateStatus = async (req, res) => {
    try {
        const { game, status } = req.body;
        const updatedPlayer = await playerModel.findByIdAndUpdate(
            req.params.id,
            { [`status.${game}`]: status },
            { new: true, runValidators: true },
        );
        return res.status(200).json({ success: true, player: updatedPlayer });
    } catch (err) {
        return res.status(400).json({
            success: false,
            message: "status update failed",
            err: err.message,
        });
    }
};
module.exports = {
    createPlayer,
    findAllPlayers,
    findPlayer,
    updatePlayer,
    deletePlayer,
    updateStatus,
};
