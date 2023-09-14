// 8. Find the product of all digit of a positive integer.
// For example:
// Number = 312
// Sum of digits = 6 (3 x 1 x 2)

#include <iostream>
using namespace std;

int main(){
    
    int num;
    cout<<"Enter the number";
    cin>>num;

    int remainder; int product=1;  
    while(num!=0){
        remainder=num%10;  // if number 115 and we divivde by 10 we get 5
        product=product*remainder;   // this reminder is we addded in sum
        num=num/10;             // now we divide the number by 10 for getting 115 /10 --> 11
    }
cout<<product;
    

    return 0;
}