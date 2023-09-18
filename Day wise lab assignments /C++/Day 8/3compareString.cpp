// 3. Compare the two strings and return true if they are same else return false.
// bool Compare(char s1[], char s2[]);


#include <iostream>
using namespace std;

bool Compare(char[],char[]);
int main(){
    char s1[]="cpp";
    char s2[]="cpp";
   bool result= Compare(s1,s2);
   
cout<<result;

    return 0;
}

bool Compare(char s1[], char s2[]){
    int i=0;
   while (s1[i]!='\0' && s2[i]!='\0')
   {
    if(s1[i]!=s2[i]){
        return false;
    }
    i++;
   }
   return s1[i] == '\0' && s2[i] == '\0';
   
}

