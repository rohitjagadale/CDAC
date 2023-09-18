// 4. In the given string, convert all lower case chanracters to upper case.
// void ToUpper(char s[]);

#include <iostream>
using namespace std;

void ToUpper(char[]);

int main(){
    char s[]="rohit";
    ToUpper(s);
    cout<<s;

    return 0;
}

void ToUpper(char s[]){
    char *ptr=s;
    while(*ptr !='\0'){
        if(*ptr >='a' && *ptr<='z'){
            *ptr=*ptr-32;
        }

        ptr++;
    }
    

}