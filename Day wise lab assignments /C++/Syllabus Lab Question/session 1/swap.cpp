// Swap two numbers

#include <iostream>
using namespace std;

int main(){
    int no1,no2,temp;
    cout<<"Enter the two number";
    cin>>no1>>no2;
    temp=no1;
    no1=no2;
    no2=temp;

    cout<<"The number after swap is : first Number:"<<no1<<endl<<"second no is:"<<no2;

    return 0;
}