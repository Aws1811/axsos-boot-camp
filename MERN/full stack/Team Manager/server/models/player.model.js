const mongoose = require("mongoose");

const playerSchema = new mongoose.Schema(
    {
        name: {
            type: String,
            required: [true, "name is needed"],
            minlength: [2, "name must be at least 2 char"],
        },
        prefer: {
            type: String,
        },
        status: {
            game1: {
                type: String,
                enum: ["Playing", "Not Playing", "Undecided"],
                default: "Undecided",
            },
            game2: {
                type: String,
                enum: ["Playing", "Not Playing", "Undecided"],
                default: "Undecided",
            },
            game3: {
                type: String,
                enum: ["Playing", "Not Playing", "Undecided"],
                default: "Undecided",
            },
        },
    },

    { timestamps: true },
);

const playerModel = mongoose.model("player", playerSchema);
module.exports = playerModel;
