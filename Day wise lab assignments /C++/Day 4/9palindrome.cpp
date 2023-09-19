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
    do{
          cout << "Enter the number that you wants to check wheter it palindrome number or NOt:";
    cin >> num;
    if(num<=0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 : ";
        cin >> num;
    }
    }while (num<=0);

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