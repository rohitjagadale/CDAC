$(document).ready(()=>{
    $('#btn').click(()=>{
        var flag1 = validateCustomerName();
        var flag2 = validateBillingDate();
        if(flag1 && flag2){
            var id = $('#orderId').val();
            var nm = $('#custName').val();
            var bdate = $('#billingDate').val();
            var sdate = $('#shipingDate').val();
            var amount = $('#orderTotal').val();

            var obj = {orderId: id, name: nm, billingDate: bdate, shippingDate: sdate, orderTotal: amount};
            var nwWindow = window.open("", "Order Display");
            nwWindow.document.write("Order Id: " + obj.orderId +", Order Name: " +obj.name + ", Billing Date: " + obj.billingDate + ", Shipping Date: " + obj.shippingDate +", Total Amount: " + obj.orderTotal);
        }         
        
    })

    function validateCustomerName(){
        var nm = $('#custName').val();
        console.log(nm);
        if(nm.trim().length < 6){
            $('#nmErr').html("Customer Name can not be < 6 characters");
            return false;
        }
        else{
            $('#nmErr').html("");
            return true;
        }
    }

    function validateBillingDate(){
        var billDate = $('#billingDate').val();
        var shipDate = $('#shipingDate').val();
        if(billDate > shipDate){
            $('#billErr').html("Bill Date can not be greater than shipping date");
            return false;
        }
        else{
            $('#billErr').html("");
            return true;
        }
    }
})
