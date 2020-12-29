
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

//Test#1  Insert the Vacation data
var db = require('../db/trains')
var data = require('../data/trains')

// Insert if argv[2] == insert otherwise select
if (process.argv.length > 2 && process.argv[2] === 'insert') {
    // Save multiple rows
    db.saveMany(data.MultipleRows, function (err, docs) {
        if (err) {
            console.log("Failed multiple row insert")
            console.log(err)
            process.exit(1)
        } else {
            console.log("Success - Multiple rows inserted - %d", docs.length)
            process.exit(0)
        }
    });
} else {

    // Select trains with some criteria
    var selectCriteria = {}
    var options = {fields:{name:1,type:1,city:1}}
    db.select(selectCriteria, options, function (err, data) {
        if (err) {
            console.log("Failed to get trains : %s", criteria)
            console.log(err)
            process.exit(1)
        } else {
            console.log("Successfully selected %d documents for %s", data.length, JSON.stringify(selectCriteria))
            console.log(data)
            process.exit(0)
        }
    });
}