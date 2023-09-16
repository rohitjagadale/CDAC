// 5. Find the first digit in a positive integer.
// For example:
// Number = 32
// First Digit = 3


#include <iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter the Positive Interger/ Number";
    cin>>num;

    while(num>=10){
        num=num/10;
    }
    cout<<num;
}