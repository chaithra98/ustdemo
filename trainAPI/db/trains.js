/**
 * All database operations related to the Trains collection will reside in this file
 */
var model = require('../models/trains')
var settings = require('../db/settings')

// CREATE the vacation package
exports.save = function (data, callback) {

    new model.Trains(data).save(function (err, inserted) {
        callback(err, inserted)

    })
}

// CREATE multiple vacation packages
exports.saveMany = function (rows, callback) {

    model.Trains.insertMany(rows, function (err, docs) {
        callback(err, docs)
    })

}

// UPDATE the vacation packages
// http://mongoosejs.com/docs/api.html#model_Model.update
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