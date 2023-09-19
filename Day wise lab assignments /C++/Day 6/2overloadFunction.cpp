#include <iostream>
using namespace std;

int add(int num1, int num2){
    int sum=num1+num2;
    cout<<"Sum is: "<<sum;
    return 0;
}
float add(float num1, float num2){
    float sum=num1+num2;
     cout<<"Sum is: "<<sum;
     return 0;

}

int main(){
    cout<<"Enter the two number";
    float num1;float num2;
    cin>>num1>>num2;
    add(num1,num2);
    

    return 0;
}