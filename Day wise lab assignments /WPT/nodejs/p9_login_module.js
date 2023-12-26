const m = require('./p9_userDb');
exports.chkLoginData=function(uname, pass){
    var flag1 = chkUserName(uname);
    var url = chkUnameAndPass(uname, pass);
    if(flag1){
        return url;
    }
    else{
        return "User Name must be atleast of 6 characters ";
    }
}

exports.chkUserName=function(uname){
    if(uname.trim().length < 6)
        return false;
    else
        return true;
}

exports.chkUnameAndPass=function(uname, pass){
    var users = m.users;
    for(var user of users)
    {
        if(uname === user.username){
            if(pass === user.password){
                return "/success.html";
            }
        }            
    }
    return "/failure.html";
}