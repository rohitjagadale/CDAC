const http = require('http');

var server = http.createServer((req,res)=>{
    console.log("Requested URL: " + req.url);
    console.log("Requested mtd: " + req.method);
    res.writeHead(200,{"content-type":"text/html"});
    res.write("<h1>Welcome to Nodejs</h1>");
    res.end("<h1>This is end of response</h1>");
})
server.listen(6000, function(){
    console.log("server is up and running")
})