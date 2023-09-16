// 9. Given a positive integer N, check if its palindrome or not. A palindrome number is a number that is same as its reverse.
// For example:
// Number = 32
// Not a palindrome. (Reverse is 23 and not same as 32)
// Number = 545
// A palindrome. (Reverse is 545 and not same as 545)


#include <iostream>
using namespace std;

int main(){
    
    int num;
    cout<<"Enter the number";
    cin>>num;

    int remainder; int reverse=0;  int temp=num;
    while(num!=0){
        remainder=num%10;  
        reverse=reverse*10+remainder;  
        num=num/10;            
    }
if(temp==reverse){
    cout<<"A palindrome";
}else{
    cout<<"Not a palindrome";
}
    

    return 0;
}