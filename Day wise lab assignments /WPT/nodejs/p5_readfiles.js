const file = require('fs')
const readline = require('readline');
var file1 = "mydata.txt";
var file2 = "myfile.data";
file.exists(file1, function (flag) {
    if (flag) {
        file.stat(file1, function (error, status) {
            if (error) {
                console.log("error occured while checking status", error);
            }
            else {

                console.log("Size of file: " + status.size);
                const fileRead = readline.createInterface({
                    input: file.createReadStream(file1),
                    output: process.stdout,
                    terminal: false
                })
                console.log("Content of file 2");
                //make line count
                var linecount = 0;
                fileRead.on('line', (line) => {
                    console.log(++linecount + ": " + line);
                });
            }
        })
    }
    else {
        console.log("file doesn't exists...");
    }
})

file.exists(file2, function (flag) {
    if (flag) {
        file.stat(file2, function (error, status) {
            if (error) {
                console.log("Error occured while checking status of file ", error);
            }
            else {
                console.log("size of file is: " + status.size);
                //read content from file2 line by line using createReadStram
                const fileRead = readline.createInterface({
                    input: file.createReadStream(file2),
                    output: process.stdout,
                    terminal: false
                })
                //make line count
                var linecount = 0;
                console.log("Content of file 2");
                fileRead.on('line', function (line) { 
                    console.log(++linecount + ": " + line);
                })
            }
        })
    }
    else {
        console.log("File doesn't exists");
    }
})