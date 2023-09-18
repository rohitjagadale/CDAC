#include <iostream>
using namespace std;

int main(){
    float basicSalary;
    cout<<"Enter your basic salary";
    cin>>basicSalary;

    float hra, da,pf;
    hra=basicSalary*15/100;
    da=basicSalary*30/100;
    pf=basicSalary*12.5/100;

    float grossSalary=basicSalary+hra+da;
    float NetSalary=grossSalary-pf;
    cout<<"Your Net salary "<<NetSalary<<endl;

    return 0;
}