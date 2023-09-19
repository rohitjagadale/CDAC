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
  

    
     do{
           cout<<"Enter the two numbers";
    cin>>no1>>no2;
 
    if(no1<0 || no2<0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 or equal to 0 : ";
         cin>>no1>>no2;
    }
    }while (no1<0 || no2<0);

    for(int i=no1;i<=no2;i++){
        sum=sum+i;
    }
    cout<<sum;

    return 0;
 }