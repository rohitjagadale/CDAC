// write a program to accept 5 subject marks from user and find its average

#include <iostream>
using namespace std;
int main(){
    float sub1,sub2,sub3,sub4,sub5;  
    cout<<"Enter the five subject marks with space seprated";
    cin>>sub1>>sub2>>sub3>>sub4>>sub5;

    int average;
    average=(sub1+sub2+sub3+sub4+sub5)/5;
    cout<<"average is : "<<average<<endl;

    return 0;
}