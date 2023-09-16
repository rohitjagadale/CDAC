// 3. Find sum of all numbers between two positive integers N and M, including N and M.
// For example:
// N = 3
// M = 7
// Sum = 25 (3 + 4 + 5 + 6 + 7)

#include <iostream>
using namespace std;
 int main(){
    int no1,no2;
    int sum=0;
    cout<<"Enter the two numbers";
    cin>>no1>>no2;

    for(int i=no1;i<=no2;i++){
        sum=sum+i;
    }
    cout<<sum;

    return 0;
 }