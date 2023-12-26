$(document).ready(function () {
    var selectMonth = $('#month');
    var monOptions = { 1: "January", 2: "February", 3: "March", 4: "April", 5: "May", 6: "June", 7: "July", 8: "August", 9: "Septemeber", 10: "October", 11: "November", 12: "December" };
    $.each(monOptions, function (val, text) {
        selectMonth.append($('<option></option>').val(val).html(text));
    });

    $('#month').change(function () {
        var mon = $('#month').val();
        console.log(mon);
        var selectDate = $('#date');
        selectDate.find('option').remove();
        switch (mon) {
            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            case "10":
            case "12":
                console.log("In date case:");
                for (var i = 1; i <= 31; i++) {
                    selectDate.append($('<option></option>').val(i).html(i));
                }
                break;
            case "4":
            case "6":
            case "9":
            case "11":
                for (var i = 1; i <= 30; i++) {
                    selectDate.append($('<option></option>').val(i).html(i));
                }
                break;
            case "2":
                for (var i = 1; i <= 29; i++) {
                    selectDate.append($('<option></option>').val(i).html(i));
                }
                break;
        }
    });

    var selectYear = $('#year');
    for (var i = 1950; i <= new Date().getFullYear(); i++) {
        selectYear.append($('<option></option>').val(i).html(i));
    }

    function chkRequiredInput() {
        var flag = true;
        $('input[required]').each(function () {
            if ($(this).val() === "")
                flag = false;
        });
        return flag;
    }

    $('#btn').click(function() {
        var flag1 = chkRequiredInput();
        if (flag1) {
            var flag2 = chkRadioButton();
            var flag3 = chkCheckBoxes();
            if (flag2 && flag3) {
                console.log(flag1);
                var nm = $('#name').val();

                var dob = $('#year').val() + "/" + $('#month').val() + "/" + $('#date').val();

                var email = $('#email').val();

                var gender = $("input[name='gender']:checked").val();

                var lno = $('#luckyNo').val();

                var hvy = $('input[name="favFood"]').val();

                var obj = { Name: nm, Dob: dob, Email: email, Gender: gender, LuckyNo: lno };

                var nwWindow = window.open("", "Form Data");
                //console.log(obj.nm);
                nwWindow.document.write("Name: " + obj.Name + ", Date of Birth: " + obj.Dob + ", Email: " + obj.Email + ", Gender:" + obj.Gender + ", Lucky No: " + obj.LuckyNo);
            }
        }
        else {
            alert("all fields are mandatory");
        }
    })


    function chkRadioButton() {
        if ($("input[name='gender']:checked").val()) {
            $("#genderErr").html();
            return true;
        }
        else {
            $("#genderErr").html("Check one radio button").css("color", "red");
            return false;
        }
    }

    function chkCheckBoxes() {
        var chks = $('input[name="favFood"]:checked').length;

        if (chks < 2) {
            $("#hobbyErr").html("Select atleast two checkbox").css("color", "red");
            return false;
        }
        else {
            $("#hobbyErr").html("");
            return true;
        }
    }
})