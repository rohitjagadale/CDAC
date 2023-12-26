const http = require('http');
const url = require('url');
const fs = require('fs');
const m = require('./p3_circle');

var server = http.createServer((req, resp)=>{
    resp.writeHead(200,{"content-type":"text/html"});
    var qry = url.parse(req.url,true);
    console.log(qry);
    //qry.pathname: "/form" qry.query: remaining query string after ?
    switch(qry.pathname){
        case "/form":
            var rs = fs.createReadStream("./html/p17_circle.html");
            rs.pipe(resp);
            break;
        case "/Show":
            resp.write("<h1>Area of circle: " + m.calcArea(qry.query.num) +"</h1>");
            resp.write("<h1>Perimeter of circle: " + m.calcCircumference(qry.query.num)+"</h1>");
            resp.end("");
            break;
        default:
            resp.write("<h1>Default Page</h1>");
            resp.end("<h1>Write /form to see the form in the url</h1");
    }
});

server.listen(5050,function(){
    console.log("Server is running");
})