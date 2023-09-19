// 4. Find prime numbers between two positive integers N and M, including N and M.
// For example:
// N = 3
// M = 10
// Prime Numbers = 3 5 7


#include <iostream>
using namespace std;

int main(){

    int startNo,endNo;

    int temp; // if user enter start number less than end no

    int prime;  // if number is prime then prime=1 

    cout<<"enter the two number ";
   

 do{
           cout<<"Enter the two numbers";
    cin>>startNo>>endNo;
 
    if(startNo<0 || endNo<0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 or equal to 0 : ";
         cin>>startNo>>endNo;
    }
    }while (startNo<0 || endNo<0);

   
    if(startNo>endNo){
        temp=startNo;
        startNo=endNo;
        endNo=temp;
    }

    for(int i=startNo;i<=endNo;i++){
        if(i==1){
            i++;
        }
        prime=1;

        for( int j=2;j<i;j++){
            if(i%j==0){
                prime=0;
                break;
            }
        }

        if(prime==1){
            cout<<i<<" ";
        }
    }

    return 0;
}