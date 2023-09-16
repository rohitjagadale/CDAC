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
        remainder=num%10;  
        if(remainder<0){
            remainder=remainder*(-1);
        }
        sum=sum+remainder;  
        num=num/10;             
    }
cout<<sum;

    return 0;
}