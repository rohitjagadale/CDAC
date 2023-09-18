#include <iostream>
using namespace std;

int main(){

    float basicSalary, totalSales, netSalary;
    cout<<"Enter the bassic salary and total sales";
    cin>>basicSalary>>totalSales;
    float commision;

    if(5000<=totalSales && totalSales<=7500)
    {
        commision=basicSalary*3/100;
    }
    else  if(7501<=totalSales && totalSales<=10500)
    {
        commision=basicSalary*8/100;
    }
    else  if(10501<=totalSales && totalSales<=15000)
    {
        commision=basicSalary*11/100;
    }
    else  if(15000<=totalSales)
    {
        commision=basicSalary*15/100;
    }
    else{
        commision=0;
    }

    netSalary=basicSalary+commision;
    cout<<netSalary<<endl; 
    return 0;
}