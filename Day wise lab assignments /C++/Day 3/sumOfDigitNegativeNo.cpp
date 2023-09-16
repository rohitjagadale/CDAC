// 7. Find the sum of all digit of a integer (both positive and negative).
// For example:
// Number = -3245
// Sum of digits = 14 (3 + 2 + 4 + 5)
// Number = 12
// Sum of digits = 3 (1 + 2)

#include <iostream>
using namespace std;

int main(){
    
    int num;
    cout<<"Enter the number";
    cin>>num;

    int remainder; int sum=0;
    while(num!=0){
        remainder=num%10;  // if number 115 and we divivde by 10 we get 5
        sum=sum+remainder;   // this reminder is we addded in sum
        num=num/10;             // now we divide the number by 10 for getting 115 /10 --> 11
    }
cout<<sum;

    return 0;
}