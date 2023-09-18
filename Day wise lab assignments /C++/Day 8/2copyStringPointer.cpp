// 2. Copy the source string "src" into destination string "dest".
// void StrCpy(char dest[], char src[]);


#include <iostream>
using namespace std;

void StrCpy(char[],char[]);


int main(){
    char src[]="This is src code";
    char dest[]="";

    StrCpy(dest,src);
    cout<<"Now we get destionation code is "<<dest<<endl;
    


    return 0;
}

void StrCpy(char dest[], char src[]){
   char *destPtr=dest;
    const char *srcPtr=src;
    while(*srcPtr!='\0'){
        *destPtr=*srcPtr;
        *destPtr++;
        *srcPtr++;
    }
     *destPtr = '\0'; 

}
