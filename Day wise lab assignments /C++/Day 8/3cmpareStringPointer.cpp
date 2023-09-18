// 3. Compare the two strings and return true if they are same else return false.
// bool Compare(char s1[], char s2[]);


#include <iostream>
using namespace std;

bool Compare(char[],char[]);
int main(){
    char s1[]="cpp";
    char s2[]="cpa";
   bool result= Compare(s1,s2);
   
cout<<result;

    return 0;
}

bool Compare(char s1[], char s2[]) {
    char *ptr1 = s1;
    char *ptr2 = s2;
    
    while (*ptr1 != '\0' && *ptr2 != '\0') {
        if (*ptr1 != *ptr2) {
            return false;
        }
        ptr1++;
        ptr2++;
    }
    
   
    return *ptr1 == '\0' && *ptr2 == '\0';}

