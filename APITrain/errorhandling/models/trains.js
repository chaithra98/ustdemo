
var settings = require('../db/settings')


var TrainsSchema = settings.mongoose.Schema(
    {
        trainNo: Number,
        trainName: {type:String, required:[true,'name is needed']},    
        price: Number,
        fromStation: String,
        toStation: String
        
    }
);

// Export the model
exports.Trains = settings.mongoose.model('train', TrainsSchema)