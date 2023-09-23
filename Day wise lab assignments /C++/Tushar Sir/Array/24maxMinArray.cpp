// Accept five integers in an array and use separate functions to:
// Find maximum and minimum of the integers. Do not sort the array.
// Multiply each element of the array by 5 and store it in another array and display it.



#include <iostream>
using namespace std;

int findMax(int numbers[]){
    int max=numbers[0];

    for(int i=0;i<5;i++){
        if(numbers[i]>max){
            max=numbers[i];
        }
    }
    return max;
}
int findMin(int numbers[]){
    int min=numbers[0];

    for(int i=0;i<5;i++){
        if(numbers[i]<min){
            min=numbers[i];
        }
    }
    return min;
}

int multiply5(int numbers[]){
        int newArray[5];

        for(int i=0;i<5;i++){
            newArray[i]=numbers[i]*5;
        }
for(int i=0;i<5;i++){
    cout<<newArray[i]<<" ";
}
        return 0;;
}

int main(){
    int numbers[5]={};
    cout<<"Enter the five element in array";
    for(int i=0;i<5;i++){
        cin>>numbers[i];
    }

int max=findMax(numbers);
cout<<"maximun Elemnt of array is"<<max<<endl;
int min=findMin(numbers);
cout<<"minmum element fro the array is:"<<min<<endl;
multiply5(numbers);
    return 0;
}