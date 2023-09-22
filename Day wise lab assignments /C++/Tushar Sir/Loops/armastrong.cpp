#include <iostream>
using namespace std;
int main(){
int num;
cout<<"Enter the Number to chec wether its armstrong number or not:";
cin>>num;

int reminder;
int count=0;
int orignalnum=num;
int orignalnum2=num;
int power=1;
// int j;
int result=0;

while(num!=0){  //153
    count++;     //1 2 3
    num=num/10;   //15
}
// j=count;  //3

while(orignalnum!=0){
    reminder=orignalnum%10;  //3
    // count=j;
    for(int i=1;i<=count;i++){
        power=power*reminder;  //27
      
    }
    
  result=result+power; //
  power=1;
    orignalnum=orignalnum/10;
}

if(result==orignalnum2){
    cout<<"Number is armstrong number";
}else{
    cout<<"Number is not armstrong";
}


    return 0;
}