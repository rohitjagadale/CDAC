const file = require('fs');

console.log("Before Async");
console.log("Before readFile() fun");
//asynchronous operation
//read from file asynchronously
file.readFile("test.txt",function(error, data){
    if(error){
        console.log(error);
    }
    else{
        console.log("Data of file: \n" + data.toString());
    }
});

file.readFile("target_test.txt",function(error, data){
    if(error){
        console.log(error);
    }
    else{
        console.log("Data of another file: \n" + data.toString());
    }
});
console.log("After Async");

var data = file.readFileSync("test.txt");
console.log("Synchronously Data of file: "+data.toString());
console.log("after readsync");