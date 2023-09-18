
// 4. In the given string, convert all lower case chanracters to upper case.
// void ToUpper(char s[]);

#include <iostream>
using namespace std;
void ToUpper(char[]);

int main(){

    char s[]="Cpp";
    ToUpper(s);
    cout<<"Upper case :"<<s<<endl;

    return 0;
}

void ToUpper(char s[]){
int i=0;
while(s[i]!='\0'){
if(s[i]>='a' && s[i]<='z'){
    s[i]=s[i]-32;
}
i++;

}

}