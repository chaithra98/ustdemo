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

