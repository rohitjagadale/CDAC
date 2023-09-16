//  Calculate compound interest



#include <iostream>
#include <cmath>
using namespace std;


int main(){
int Principle ;
   int Time ;
   float Rate ;
   int NumberTimes;
   cout<<"enter the principle time of duration rate of interst and number of times in year in space seprated sequesntially";
   cin>>Principle>>Time>>Rate>>NumberTimes;
   float result;
   result = Principle * pow((1 + ( Rate / (NumberTimes * 100) )), ( NumberTimes * Time));
   cout << result << endl;
   cout << "Total amount is: " << Principle + result;
   cout<<"Total compund intrest is"<<result-Principle;
    return 0;
}