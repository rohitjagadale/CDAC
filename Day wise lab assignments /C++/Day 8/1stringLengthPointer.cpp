// Assignment: Implement following functions. Implement them using [] operator and also using pointer operations. Do not use any library functions.

// 1. Given a string, return its length.
// int Strlen(char s[]);


#include <iostream>
using namespace std;

int strLengthPointer(char[]);

int main(){
    char str[]="CppAssignments";
    int length=strLengthPointer(str);
    cout<<"Length of string using pointer is:"<<length<<endl;
    return 0;
}


int strLengthPointer(char str[]){
    int length=0;
    char *p=str;
    while(*p!='\0'){
        length++;
        *p++;
    }

    return length;
}