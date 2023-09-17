// 2. Given an array of n integers, find the smallest element and return if from function.
// int findMin(int nums[], int n);

#include <iostream>
using namespace std;
int smallestElement(int [],int);

int main(){

       int n=4;
    int numbers[]={4,34,3,90};
    int smallest=smallestElement(numbers,n);
    cout<<"Smallest element from an array is:"<<smallest<<endl;
    return 0;
}

int smallestElement(int numbers [],int n){
    int smallest=numbers[0];
    for(int i=1;i<n;i++){
        if(numbers[i]<smallest){
            smallest=numbers[i];
        }
    }


    return smallest;
}