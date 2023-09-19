#include <iostream>
using namespace std;

void isReverse(int num){
    int remainder, reverse=0;

while(num>0){
    remainder=num%10;
    reverse=reverse*10+remainder;
    num=num/10;  
}
cout<<"Reverse Number is :"<<reverse;
}
int main(){
    
    int num;
   cout<<"Enter the Numebr:";
   cin>>num;
   isReverse(num);
    return 0;
}

 
