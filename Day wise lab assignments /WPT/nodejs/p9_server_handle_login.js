const http = require("http");
const url1 = require("url");
const fs = require("fs");
const m = require("./p9_login_module");

var server = http
  .createServer((req, resp) => {
    //parsing the url
    var q = url1.parse(req.url, true);
    //q has two properties: 1) pathname(/url-pattern) 2) query(string after ? mark)

    //set response header
    resp.writeHead(200, { "content-type": "text/html" });
    switch (q.pathname) {
      case "/login":
        //use fs(file system) to read html file
        var readStream = fs.createReadStream("./html/p9_login.html");
        
        //use pipe between readStream and response to fill response with given html file
        readStream.pipe(resp);
        break;
    
      case "/Check_Form":
        var user = q.query.uname;
        var pass = q.query.pass;
        var flag = m.chkUserName(user);
        if(flag){
            var url = m.chkUnameAndPass(user, pass);
            resp.write(url);
        }
        else{
            resp.write("User name must be of 6 characters atleast");
        }
        break;
      default:
        resp.write("<h1>Default page is loaded</h1>");
        resp.end("<h1>append url with /login</h1>");
    }
  })
  .listen(9000, function () {
    console.log("Server is up and running on port 9000");
  });
