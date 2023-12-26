const fs = require('fs');
const http = require('http');
var filenm = "test.txt";
var server = http.createServer(function(req, resp){
    resp.writeHead(200,{"content-type":"text/html"})
    resp.write(fs.readFileSync(filenm));
    
    resp.end("<h6>End</h6>")
})

server.listen(5000, function(){
    console.log("Server up and running");
})
