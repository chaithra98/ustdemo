/**
 * Simple tests for all DB operations
 * 
 * Adds the test data to the Database = vacation Collection = vacations
 */


// /**
//  * Setup the Database URL
//  */

const DB_USER = "Chaithra";
const DB_PASSWORD = "ust123456";
const DB_NAME = "acmetravel";
const CLUSTER_HOST = "apidemo.f31av.mongodb.net";

//DB Connection String
// mongodb+srv://Chaithra:<password>@apidemo.f31av.mongodb.net/<dbname>?retryWrites=true&w=majority

exports.DB_URI= `mongodb+srv://${DB_USER}:${DB_PASSWORD}@${CLUSTER_HOST}/${DB_NAME}?retryWrites=true&w=majority`;



var express = require('express')
var bodyParser = require('body-parser')



var router = express.Router();


// setup the hotels api
require('./api/v1/trains')(router);

// Create the express app
app = express();

// Setup the body parser
//app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());//{type: '*/*'}));

// Setup the app to use the router
app.use(router);



// Start the listener
app.listen(3000);
console.log('Listening on 3000')

