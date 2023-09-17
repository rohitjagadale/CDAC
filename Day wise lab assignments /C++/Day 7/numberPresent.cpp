// 5. Given an array of n integers, find the given element. Return true if element is present in the array else return false.
// // bool search(int nums[], int n, int element);


#include <iostream>
using namespace std;
bool isPresent(int [],int , int);

int main(){
    int n=5;
    int toFind;
    cout<<"enter the number that you want to find in array:";
    cin>>toFind;
    int numbers[]={1,2,3,4,5};
    bool check=isPresent(numbers,n,toFind);
    cout<<check;



    return 0;
}

bool isPresent(int numbers[],int n,int toFind){
    for(int i=0;i<n;i++){
        if(numbers[i]==toFind){
            return 1;
        }
        else{
        return 0;
    }
    
    }
}