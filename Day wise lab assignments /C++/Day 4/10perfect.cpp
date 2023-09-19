// 10. Given a positive integer N, check if it is a perfect number or not.
// Perfect number is a positive integer that is equal to the sum of its factors (excluding the number itself).
// For example:
// N = 12
// Factors = 1 2 3 4 6 (we do not consider 12)
// Sum of factors = 1 + 2 + 3 + 4 + 6 = 16
// As Sum of factors is not equal to the Number 12, 12 is not a perfect number.
// N = 6
// Factors = 1 2 3 (we do not consider 6)
// Sum of factors = 1 + 2 + 3 = 6
// As Sum of factors is equal to the Number 6, 6 is a perfect number.


#include <iostream>
using namespace std;

int main(){
    
    int num;
   do{
          cout << "Enter the number that you wants to check wether its perfect number or not";
    cin >> num;
    if(num<=0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 : ";
        cin >> num;
    }
    }while (num<=0);
    int sum=0;

   for(int i=1;i<=num/2;i++){
    if(num%i==0){
        sum=sum+i;
    }
    
   }
   if(sum==num){
    cout<<"A Perfect Number";}else{
        cout<<"Not a Perfect Number";
    }

    return 0;
}