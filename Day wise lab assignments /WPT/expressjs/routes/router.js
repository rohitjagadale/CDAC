const express = require("express");
var router = express.Router();
var conn = require('../db/dbConnect'); //dbConnect.js file is available in db folder

//request url: localhost:9000/employees, method : get => render to index page
router.get("/employees", function(req,resp){
    //create a sql query and write a call back function
    conn.query("select * from employees",function(error, data, fields){
        if(error){
            resp.status(500).send("<h3>No data found</h3>");
        }
        else{
            resp.render("index",{empData:data});
        }
    })
})

//request url: localhost:9000/displayAddEmpform method: get => render to view add-employee-form
router.get("/displayAddEmpform", function(req, resp){
    resp.render("add-employee-form");
})

//request url: localhost:9000/addEmployee method: post => redirect to employees
router.post("/addEmployee", function(req, resp){
    conn.query("insert into employees values(?,?,?,?)", [req.body.empid, req.body.empname, req.body.salary, req.body.city], (error,result)=>{
        if(error){
            resp.status(500).send("<h3>Data not inserted</h3>");
        }
        else{
            console.log(result);
            resp.redirect("/employees");
        }
    });
})

//request url: localhost:9000/Edit/:empid method: get => redirect to edit-employee-form
router.get("/Edit/:empid", function(req, resp){
    conn.query("select * from employees where eid = ?", [req.params.empid],function(error, data, fields){
        if(error){
            resp.status(500).send("<h3>No data found</h3>");
        }
        else{
            resp.render("edit-employee-form", {empData:data});
        }
    })
   
})
module.exports = router;