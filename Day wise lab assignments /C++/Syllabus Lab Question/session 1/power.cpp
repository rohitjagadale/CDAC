//  Calculate power of a number
#include <iostream>
using namespace std;

int main(){
    int base,expo,power=1;
    cout<<"Enter the base and exponent:";
    cin>>base>>expo;

    while (expo!=0){
power=power*base;
expo--;
    }
    cout<<"Power is : "<<power<<endl;
   
    return 0;
}