const mongoose = require("mongoose");

const authorSchema = new mongoose.Schema(
    {
        name: {
            type: String,
            required: [true, "name is needed"],
            minlength: [2, "name must be at least 2 char"],
        },
    },

    { timestamps: true },
);

const authorModel = mongoose.model("author", authorSchema);
module.exports = authorModel;
