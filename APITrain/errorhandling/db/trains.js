/**
 * All database operations related to the trains collection will reside in this file
 */
var model = require('../models/trains')
var settings = require('./settings')

// CREATE the vacation package
exports.save = function (data, callback) {

    new model.Trains(data).save(function (err, inserted) {
        callback(err, inserted)

    })
}

// CREATE multiple train packages
exports.saveMany = function (rows, callback) {

    model.Trains.insertMany(rows, function (err, docs) {
        callback(err, docs)
    })

}

// UPDATE the train packages

exports.update = function (criteria, doc, callback) {
    // Replaced .update() with .updateMany() as .update() is deprecated
    model.Trains.updateMany(criteria, doc, function (err, data) {
        callback(err, data)

    })
}

// RETRIEVE vacation packages based on criteria
exports.select = function (criteria, callback) {
    model.Trains.find(criteria, function (err, data) {
        callback(err, data)
    })
}