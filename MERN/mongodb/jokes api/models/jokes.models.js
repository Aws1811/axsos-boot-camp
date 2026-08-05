const mongoose = require("mongoose");

const JokesSchema = new mongoose.Schema({
    setup: {
        type: String,
        required: [true, "Setup is needed"],
        minlength: [4, "setup must be 4 charcters at least"],
    },
    punchline: {
        type: String,
        required: [true, "punchline is needed"],
        minlength: [4, "punchline must be 4 charcters at least"],
    },
},
    
    {timestamps:true}
);

const jokesModel = mongoose.model("joke",JokesSchema);
module.exports = jokesModel;