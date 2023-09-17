// 3. Given an array of n integers, find the second largest element and return if from function.
// int findSecondLargest(int nums[], int n);


#include <iostream>
using namespace std;

int secondLarge(int [],int);
int main(){
    int n=5;
    int numbers[]={4,33,3,5,90};
    int secondMax=secondLarge(numbers,n);
    cout<<"second Largest element from an array is:"<<secondMax<<endl;

    return 0;
}


int secondLarge(int numbers[],int n){
int max=numbers[0];
for(int i=0;i<n;i++){
    if(numbers[i]>max){
        max=numbers[i];
    }
}
int secondMax=numbers[0];
for(int i=0;i<n;i++){
    if(numbers[i]>secondMax){
       if(numbers[i]!=max){
        secondMax=numbers[i];
      
       }
    }
}

    return secondMax;

}