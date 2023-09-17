// 1. Given an array of n integers, find the largest element and return if from function.
// int findMax(int nums[], int n);

#include <iostream>
using namespace std;

int isLargeElement(int [],int);
int main(){
    int n=4;
    int numbers[]={4,34,3,90};
    int max=isLargeElement(numbers,n);
    cout<<"Largest element from an array is:"<<max<<endl;

    return 0;
}


int isLargeElement(int numbers[],int n){
int max=numbers[0];
for(int i=1;i<n;i++){

    if(numbers[i]>max){
        max=numbers[i];
    }
}

    return max;
}