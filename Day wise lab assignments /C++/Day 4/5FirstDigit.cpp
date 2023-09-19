// 5. Find the first digit in a positive integer.
// For example:
// Number = 32
// First Digit = 3


#include <iostream>
using namespace std;

int main(){
    int num;
   do{
          cout << "Enter the number that you wants its first digit";
    cin >> num;
    if(num<=0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 : ";
        cin >> num;
    }
    }while (num<=0);

    while(num>=10){
        num=num/10;
    }
    cout<<"first digit of number is:"<<num;
}