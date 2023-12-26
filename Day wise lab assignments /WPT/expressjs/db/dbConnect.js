const mysql = require("mysql");
var mysqlConnection = mysql.createConnection({
    host: '127.0.0.1',
    user: 'root',
    password: 'root',
    port: 3306,
    database: 'wpt'
});

mysqlConnection.connect((err)=>{
    if(err){
        console.log("Error occured ", err);
    }
    else
        console.log("conn established");
});

module.exports = mysqlConnection