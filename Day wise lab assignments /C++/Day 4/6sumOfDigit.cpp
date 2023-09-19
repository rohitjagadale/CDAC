// 6. Find the sum of all digit of a positive integer.
// For example:
// Number = 3245
// Sum of digits = 14 (3 + 2 + 4 + 5)

#include <iostream>
using namespace std;

int main(){
    int num;
   do{
          cout << "Enter the number that you wants its sum of all digits";
    cin >> num;
    if(num<=0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 : ";
        cin >> num;
    }
    }while (num<=0);
    int remainder; int sum=0;
    while(num!=0){
        remainder=num%10;  // if number 115 and we divivde by 10 we get 5
        sum=sum+remainder;   // this reminder is we addded in sum
        num=num/10;             // now we divide the number by 10 for getting 115 /10 --> 11
    }
cout<<sum;

    return 0;
}