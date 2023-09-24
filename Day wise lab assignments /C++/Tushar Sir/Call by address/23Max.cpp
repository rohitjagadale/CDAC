// Write a program which accepts two integers in main(). Pass these as arguments to function max(). In max(), find the maximum of these two numbers and using a return statement, return the address of the maximum number and print it in main().


#include<iostream>
using namespace std;

int num1,num2;

int * max(int *n1,int *n2)

{
    int *pmax;
    if(*n1>*n2)
    pmax=n1;
    else
    pmax=n2;
    return pmax;
}

int main()
{
    int *pmax;
    
    cout<<"Enter two numbers : ";
    cin>>num1>>num2;
    
    pmax= max(&num1,&num2);
    cout<<endl<<"address of maximum number is " <<pmax<<" and maximum is : "<<*pmax;
    cout <<endl;
    return 0;
}