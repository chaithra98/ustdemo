/**
 * Defines the API for showing deals for ACME partner trains
 */
var RESOURCE_NAME = 'trains';
var VERSION = 'v1';
var URI = '/' + VERSION + '/' + RESOURCE_NAME; 

const { Console } = require('console');
// Setup the vacations db
var db = require('../../db/trains')

module.exports = function(router){
    'use strict';

    router.route(URI).get(function(req, res,next){
        console.log("GET Trains")
        
        //1. fields
        var fields ={}
        if(req.query && req.query.fields !== undefined){
           fields =  createFields(req.query.fields)
        }

        //2. Setup options
        var options = {fields:fields}
        console.log(options)

        //3. execute the query
        //var id = URI.id;
        //console.log("id",id)
        var url = require('url');
        var queryString = url.parse(req.url,true);  
        var fullUrl = "http://localhost:3000" + queryString.href;
        var queryObject = url.parse(fullUrl,true).query;
        //console.log(fullUrl)
       
        // Accessing href property of an URL  
        console.log("Complete href is :-"+queryString.href); 
        var criteria = queryObject;//{name: "Shatabdi"}
        console.log(criteria); 
        db.select(criteria, options, function(err,docs){
           
            if(err){
                console.log(err)
                res.status(500)
                res.send("Error connecting to db")
            } else {
                if(docs.length == 0){
                    res.status(404)
                }
                console.log("Retrieved trains = %d",docs.length)
                res.send(docs)
            }
        });
    });

    // router.route(URI).get('/src/:id',function(req, res,next){
    //     console.log("GET Trains")
    //     var id = req.params.id;
        
    //     // //1. fields
    //     var fields ={}
    //     if(req.query && req.query.fields !== undefined){
    //        fields =  createFields(req.query.fields)
    //     }

    //     // //2. Setup options
    //     var options = {fields:fields}
    //     console.log(options)

    //     //3. execute the query
    //     var criteria = {}
    //     db.select(criteria, options, function(err,docs){
           
    //         if(err){
    //             console.log(err)
    //             res.status(500)
    //             res.send("Error connecting to db")
    //         } else {
    //             if(docs.length == 0){
    //                 res.status(404)
    //             }
    //             console.log("Retrieved trains = %d",docs.length)
    //             res.send(docs)
    //         }
    //     });
    // });

}

// Utility function to create the JSON
// Simply parse the received fields and create a valid JSON object
// {field1:1, field2:1 ....}
function createFields(str){
    var arr = str.split(',')
    str = '{'
    for(var i=0; i < arr.length; i++){
        str += '\"' + arr[i] + '\":1'
        if(i < arr.length - 1) str += ","
    }
    str += '}'
    return JSON.parse(str)
}