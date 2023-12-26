const file = require("fs"); //fs means file system
//before reading file check whether file exists or not
//for that use exists function => returns true if exists ele returns false
var filenm = "test.txt";
file.exists(filenm, function(flag){
    if(flag){
            console.log("File exists....");
            //check status of file
            file.stat(filenm,function(error, status){
                console.log(status);
                console.log("size of file:" + status.size);
                //open a file
                file.open(filenm,"r",function(error, fd){
                    if(error){
                        console.log("Error in opening file " + error)
                    }
                    else{
                      //read data from file asynchronously
                      var charBuffer = Buffer.alloc(50);
                      file.read(fd, charBuffer, 0, 50, null, function(error, bytesread, buffer){
                        if(error){
                            console.log("Error while reading " + error);
                        }
                        else{
                            console.log(buffer.toString());
                        }
                      })
                    }
                    file.close(fd);
                })
            })         
    }
    else{
        console.log("File doesn't exist....");
    }
})