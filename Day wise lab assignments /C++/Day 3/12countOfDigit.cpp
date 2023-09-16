// 12. Find the count of a digit in a given positive integer.
// For example:
// Number = 12123
// Digit = 1
// Count of digit 1 in 12123 = 2 (as 1 appears twice in the number)

#include <iostream>
using namespace std;

int main(){
    
    int num; int check;
    cout<<"Enter the number";
    cin>>num;
    cout<<"Enter the number that we have to count occurance";
    cin>>check;

    int remainder; int singleDigit=0;  int count=0;
    while(num!=0){
        remainder=num%10; 
        singleDigit=remainder;   
        num=num/10;  

        
        if(singleDigit==check){
            count++;
        }

    }
cout<<count;
    

    return 0;
}