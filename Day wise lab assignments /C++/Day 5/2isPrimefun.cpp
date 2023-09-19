#include <iostream>
using namespace std;


bool isPrime(int num){

    int flag=1;
        for (int  i = 2; i < num; i++)
        {
            if (num%i==0)
            {
                return false;
            }
            else{
            return true;
        }
        }

}
int main(){

    int num;
    cout<<"Enter a number to check it is prime or not :";
    cin>>num;
    if(isPrime(num)){
        cout<<"True";
    }else{
        cout<<"False";
    };
    return 0;
}


