#include <iostream>
using namespace std;
int main(){
    int num1,num2;
    cout<<"Enter the 2 number which want tyo be swap";
    cin>>num1>>num2;
    
    // with the third variable

    // int temp;

    // temp=num1;
    // num1=num2;
    // num2=temp;

    // without third varaible

    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;

    cout<<"Number 1 "<<num1<<endl<<"number 2 "<<num2<<endl;

    return 0;
}