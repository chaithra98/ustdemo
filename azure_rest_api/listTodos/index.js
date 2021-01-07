// var mongoClient = require("mongodb").MongoClient;
// mongoClient.connect("mongodb://cosmosdb-ust1-todos:DfywkA4p3KvtJVGQXXCydJRW0JVBPjhEL2niPMwBI5z2ZpvJjzTCXigqgAMrhsuYbYJj5J0dCOmlNILZKBAFug==@cosmosdb-ust1-todos.mongo.cosmos.azure.com:10255/?ssl=true&appName=@cosmosdb-ust1-todos@", function (err, db) {
//   db.close();
// });

const MongoClient = require("mongodb").MongoClient;

module.exports = async function(context,req) {
    const URL = process.env.MONGODB_URL;
    const DATABASE_NAME = process.env.MONGODB_DATABASE_NAME;
    const COLLECTION_NAME = process.env.MONGODB_COLLECTION_NAME;

    const connection = await MongoClient.connect(URL, { useUnifiedTopology: true});
    const todoCollection = connection.db(DATABASE_NAME)
        .collection(COLLECTION_NAME);
    
    const results = await todoCollection
        .find({})
        .toArray();

        await connection.close();

    return {
        // status: 200, /* Defaults to 200 */
        body: JSON.stringify(results).replace(/_id/g,"id")
    };
}