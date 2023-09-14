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
    cout<<"Enter the number that you want to be get reveres";
    cin>>number;

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