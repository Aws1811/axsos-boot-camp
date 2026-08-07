const mongoose = require("mongoose");

const projectManagerSchema = new mongoose.Schema(
    {
        title: {
            type: String,
            required: [true, "title is needed"],
            minlength: [4, "title must be 4 charcters at least"],
        },
        price: {
            type: Number,
            required: [true, "price is needed"],
        },
        descrption: {
            type: String,
            required: [false],
        },
    },

    { timestamps: true },
);

const projManaModel = mongoose.model("projMana", projectManagerSchema);
module.exports = projManaModel;
