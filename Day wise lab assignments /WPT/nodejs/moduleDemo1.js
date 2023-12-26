exports.subtract=function(x, y){
  return x - y;
}

exports.multiply=function(x, y){
  return x * y;
}

exports.divide=function(x, y){
  return x / y;
}

exports.addition=function(x, y){
  return x + y;
}
exports.factorial=function(no){
  var fact = 1;
  for(var i = 1; i <= no; i++){
    fact *= i;
  }
  return fact;
}

