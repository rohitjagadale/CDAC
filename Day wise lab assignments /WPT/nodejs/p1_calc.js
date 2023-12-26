exports.add= function(a,b){
    return a+b;
}

exports.multiply = function(a,b){
    return a*b;
}

exports.divide = function(a,b){
    if(b === 0)
        return "denominator can not be zero";
    return a/b;
}

exports.subtract=function(a,b){
    return a-b;
}

exports.square = function(a){
    return a*a;
}

exports.sum = function(a,b,c,...z){
    var sum = 0;
    for(var v of arguments){
        sum += v;
    }
    return sum;
}