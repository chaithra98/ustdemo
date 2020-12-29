/**
 * All database operations related to the vacations collection will reside in this file
 */
var model = require('../models/trains')
var settings = require('../db/settings')


// CREATE multiple vacation packages
exports.saveMany = function (rows, callback) {
    model.Trains.insertMany(rows, function (err, docs) {
        callback(err, docs)
    })

}


// RETRIEVE trains packages based on criteria & fields
// https://docs.mongodb.com/manual/reference/method/db.collection.find/#find-projection
// options = {
//    fields: {/** Projection **/}
// }
exports.select = function (criteria,options, callback) {
    model.Trains.find(criteria, function (err, data) {
        callback(err, data)
    }).select(options.fields)
}