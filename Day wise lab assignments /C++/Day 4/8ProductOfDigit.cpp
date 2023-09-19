// 8. Find the product of all digit of a positive integer.
// For example:
// Number = 312
// Sum of digits = 6 (3 x 1 x 2)

#include <iostream>
using namespace std;

int main(){
    
    int num;
    do{
          cout << "Enter the number that you wants its product of its all digit";
    cin >> num;
    if(num<=0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 : ";
        cin >> num;
    }
    }while (num<=0);

    int remainder; int product=1;  
    while(num!=0){
        remainder=num%10;  // if number 115 and we divivde by 10 we get 5
        product=product*remainder;   // this reminder is we addded in sum
        num=num/10;             // now we divide the number by 10 for getting 115 /10 --> 11
    }
cout<<product;
    

    return 0;
}