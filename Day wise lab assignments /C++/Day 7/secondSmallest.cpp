#include <iostream>
using namespace std;
int secondSmallest(int[],int);
int main(){
    int n=8;
    int numbers[]={10,23,11,54,202,8,14,7};
    int secondSmall=secondSmallest(numbers,n);
    cout<<"Second small numbers is:"<<secondSmall;


    return 0;
}

int secondSmallest(int numbers[],int n){
    int smallest=numbers[0];
    for(int i=0;i<n;i++){
        if(numbers[i]<smallest){
            smallest=numbers[i];
        }
    }

    int secondSmall=numbers[0];
    for(int i=0;i<n;i++){
        if(numbers[i]<secondSmall){
            if(numbers[i]!=smallest){
                secondSmall=numbers[i];
            }
        }
    }

    return secondSmall;
}