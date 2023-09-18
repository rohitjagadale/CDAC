// Assignment: Implement following functions. Implement them using [] operator and also using pointer operations. Do not use any library functions.

// 1. Given a string, return its length.
// int Strlen(char s[]);


#include <iostream>
using namespace std;

int strLength(char[]);

int main(){

    char str [10]= "samir";

   int length= strLength(str);
    cout<<"LENGTH of string is:"<<length<<endl;

    return 0;
}


int strLength(char str[]){
    int length=0;

    while(str[length]!='\0'){
        length++;
    }
    return length;

}