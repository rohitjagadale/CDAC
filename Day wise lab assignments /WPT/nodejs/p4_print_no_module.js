exports.print1to100 = function () {
    for (var i = 1; i <= 100; i++) {
        var str = "";
        if (i % 3 === 0)
            str = "fizz";
        if (i % 5 === 0)
            str += "buzz";
        console.log(i + " " +str);
    }
}