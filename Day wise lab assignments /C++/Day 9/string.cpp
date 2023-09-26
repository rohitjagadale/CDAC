#include<iostream>
#include "stdio.h"
#include<cstring>
#include <string.h>

using namespace std;

class String
{
        char str[20];
        public:

          void getdata()
        {
             gets(str);

        }

         int operator ==(String s)
        {
               if(!strcmp(str,s.str))
                return 1;

                return 0;
        }
};

int main()
{
        String s1,s2;

        cout<<"Enter first string :: ";
        s1.getdata();
        cout<<"\nEnter second string :: ";
        s2.getdata();
        if(s1==s2)
        {
            cout<<"\nStrigs are Equal\n";
        }
        else
        {
            cout<<"\nStrings are Not Equal\n";
        }
        
        return 0;
}