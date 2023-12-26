var emp=[{empid:1, empname:"Krupa", salary:600000},
    {empid:2, empname:"Shivani", salary:600000},
    {empid:3, empname:"Shraddha", salary:600000},
    {empid:4, empname:"Jemini", salary:220000},
    {empid:5, empname:"Sandip", salary:6000},
    {empid:6, empname:"Bhavya", salary:300000}]

    for(var ob of emp){
        console.log("Id = " + ob.empid + ", Name = " + ob.empname + ", Salary = " + ob.salary);
    }

    emp.sort((e1, e2)=>{if(e1.empname < e2.empname) return -1;
                        else if(e1.empname > e2.empname) return 1;
                        else return 0;})

    console.log("=============================================")
    for(var ob of emp){
        console.log("Id = " + ob.empid + ", Name = " + ob.empname + ", Salary = " + ob.salary);
    }
