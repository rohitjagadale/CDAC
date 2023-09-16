// 1. Given a positive integer N, find all factors of N.
// For example:
// N = 12
// Factors = 1 2 3 4 6 12
// N = 5
// Factors = 1 5


#include <iostream>
using namespace std;

int main(){

    int num;

    cout<<"Enter the number that you wants its facors";
    cin>>num;
    
    for(int i=1;i<=num;i++){
        if(num%i==0){
            cout<<i<<" ";
        }
    }
    

    return 0;
}