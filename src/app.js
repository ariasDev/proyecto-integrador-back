const express = require("express");
const app = express();
const indexRoutes = require("./indexRoutes");
const listenPort = '3000';

app.use(cors())
app.use(express.urlencoded({ extended: false }))

app.use( bodyParser.json() );
app.use(bodyParser.urlencoded({ 
  extended: true
})); 

app.use("/", indexRoutes);

app.listen(listenPort, () => {
    console.log(`server on port ${listenPort}`);
});

module.exports = app;