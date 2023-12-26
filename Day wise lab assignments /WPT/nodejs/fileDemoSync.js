const file = require('fs');

//synchronous operation
//read from file
var data = file.readFileSync("test.txt");
console.log(data.toString());

//write the data to another file
file.writeFileSync("target_test.txt", data);
console.log("Data is written");