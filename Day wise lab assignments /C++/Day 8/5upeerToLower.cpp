// 5. In the given string, convert all upper case chanracters to lower case.
// void ToLower(char s[]);

#include <iostream>
using namespace std;

void ToLower(char[]);
int main(){
char s[]="Rohit";
ToLower(s);
cout<<s;


    return 0;
}

void ToLower(char s[]){
    int i=0;
    while(s[i]!='\0'){
        if(s[i]>='A' && s[i]<='Z'){
            s[i]=s[i]+('a'-'A');
        }
        i++;
    }

}