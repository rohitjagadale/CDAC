exports.factorial=function(no){
    var fact = 1;
    for(var i = 1; i <= no; i++){
        fact = fact * i;
    }
    return fact;
}

exports.myprime=function(no){
    for(var i = 2; i <= no / 2; i++){
        if(no % i === 0){
            return "not prime no";
        }
    }
    return "prime no";
}

exports.printtable=function(no){
    var str;
    for(var i = 1; i <= 10; i++){
        var ans = no * i;
        str += ans + "<br/>";
    }
    return str;
}