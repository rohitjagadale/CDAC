#include <iostream>
using namespace std;

int main(){
char inputchar , converChar;

cout<<"Enter the character to convert its into upper case or Lower case";
cin>>inputchar;
if((inputchar>='A' && inputchar<='Z') || (inputchar>='a' && inputchar<='z')){
    if(inputchar>='A' && inputchar<='Z'){
        converChar=inputchar+32;
    }else{
        converChar=inputchar-32;
    }

}else{
cout<<"Error Please enter the character which only aplhabet"<<endl;
}
cout<<converChar<<endl;

    return 0;
}