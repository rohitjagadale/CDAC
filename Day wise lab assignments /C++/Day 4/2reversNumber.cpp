// 2. Given a positive integer N, find its reverse.
// For example:
// N = 534
// Reverse = 435
// N = 5
// Reverse = 5

#include <iostream>
using namespace std;

int main(){
    int number;
    

     do{
          cout<<"Enter the number that you want to be get reveres";
    cin>>number;
    if(number<=0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 : ";
        cin >> number;
    }
    }while (number<=0);
  

    int reveres=0;
    int remainder;

    while (number!=0)
    {
        remainder=number%10;
        reveres=reveres*10+remainder;
        number=number/10;
    }
    cout<<reveres;
    
    return 0;
}