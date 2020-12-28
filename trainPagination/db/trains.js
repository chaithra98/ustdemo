/**
 * All database operations related to the vacations collection will reside in this file
 */
var model = require('../models/trains')
var settings = require('./settings')


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
//    pagination: {limit:5, offset:1}
// }
exports.select = function (criteria,options, callback) {

    // Local variable for capturing limit & offset
    var lim = 0
    var off = 0
    if(options.pagination !== undefined){
        if(options.pagination.limit !== undefined)  lim = parseInt(options.pagination.limit)
        if(options.pagination.offset !== undefined)  off = parseInt(options.pagination.offset)
    }

    model.Trains.find(criteria, function (err, data) {
        callback(err, data)
    }).select(options.fields).limit(lim).skip(off)
}