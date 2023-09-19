#include <iostream>
using namespace std;

int swapNumber(int num1, int num2){
    int temp;
    temp=num1;
    num1=num2;
    num2=temp;
    cout<<"Reverse first Number is :"<<num1<<endl<<" reverse Second Number is: "<<num2<<endl;
    return 0;
}

int main(){
    int num1,num2;
    cout<<"Enter the two Number";
    cin>>num1>>num2;
    swapNumber(num1,num2);
    return 0;
}