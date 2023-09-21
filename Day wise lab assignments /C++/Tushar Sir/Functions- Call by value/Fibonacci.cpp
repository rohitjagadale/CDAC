// Write a function ‘Fibonacci()’ to generate the terms of the fibonacci series. The number of terms should be entered by the user in main().  The series should be printed in the function. The terms of the Fibonacci series are 0 1 1 2 3 5 8 13 21 . . .



#include <iostream>
using namespace std;

int Fibonacci(int num){
    int t1=0,t2=1;
    int nextTerm=0; 

    for(int i=1;i<=num;i++){
        if(i == 1) {
            cout << t1 << ", ";
            continue;
        }
        if(i == 2) {
            cout << t2 << ", ";
            continue;
        }
 nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
        
        cout << nextTerm << ", ";

    }

    return 0;
}

int main(){
    int num;
    cout<<"Enter the number to get Fibonacci series print:";
    cin>>num;
    Fibonacci(num);




    return 0;
}