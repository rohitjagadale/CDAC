//import all libraries
const express = require('express');
const app = express(); 
const bodyParser = require('body-parser');
const path = require('path');
var routes = require("./routes/router"); // router.js file is available in routes folder which is required for routing

//configure the application
app.set("views", path.join(__dirname,"views"));
app.set("view engine","ejs");

//To add static references
app.set(express.static(path.join(__dirname, "public")))
app.use("css",express.static(path.join(__dirname, "public/css")))
app.use("js",express.static(path.join(__dirname, "public/js")))

//define middlewares
app.use(bodyParser.urlencoded({extended: false}))  // to parse the url (pathname and query)

//define route handlers
app.use("/", routes);

//listen on the port
app.listen(9000, function(){
    console.log("Server is running");
})

//exports the app
module.exports = app;