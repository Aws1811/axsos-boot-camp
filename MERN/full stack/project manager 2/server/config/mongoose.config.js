const mongoose = require('mongoose');

require("dotenv").config();

const uri = `mongodb://${process.env.ATLAS_USERNAME}:${process.env.ATLAS_PASSWORD}@ac-2kiovfo-shard-00-00.1hb3hhq.mongodb.net:27017,ac-2kiovfo-shard-00-01.1hb3hhq.mongodb.net:27017,ac-2kiovfo-shard-00-02.1hb3hhq.mongodb.net:27017/${process.env.DB}?ssl=true&replicaSet=atlas-w67wlb-shard-0&authSource=admin&appName=Cluster0`;;

mongoose
.connect(uri)
.then(() => console.log("Established a connection to the database"))

.catch(err => console.log("Something went wrong when connecting to the database", err));
