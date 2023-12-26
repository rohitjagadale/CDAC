const m = require("./p2_mymodule");
$('document').ready(function () {
    $('#btn').click(function () {
        var no = parseInt($('#num').val());
        if (no < 5){
            var ans = m.factorial(no);
            console.log("hi");
        }
        else if (no >= 5 && no < 10)
            ans = m.printtable(no);
        else
            ans = m.myprime(no);
        $('#result').html(ans);
    })
})