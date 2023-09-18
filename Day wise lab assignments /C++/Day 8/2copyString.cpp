
// 2. Copy the source string "src" into destination string "dest".
// void StrCpy(char dest[], char src[]);


void StrCpy(char dest[],char src[]);
#include <iostream>
using namespace std;
int main(){
    char dest[10]="";
    char src[10]="pune";
    StrCpy(dest,src);
    cout<<"Your destination str is:"<<dest<<endl;
    return 0;
}

void StrCpy(char dest[],char src[]){
    int i=0;
    while(src[i]!='\0'){
        dest[i]=src[i];
        i++;
    }



}

