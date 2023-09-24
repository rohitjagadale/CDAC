// Write a program to accept date, month, year from the user in a function called getDate(), and print that date in main() in dd/mm/yy format.


#include<iostream>
using namespace std;
void getdate(int *day,int *month, int *year)
{   
   cout<<"Enter day,month and year for example (12/12/2012): "<<endl;
   cin>>*day>>*month>>*year;
   
}
int main()
{
     int day,month,year;
     
     getdate(&day,&month,&year);
     
     cout<<"Date is :  "<<day<<"/"<<month<<"/"<<year<<endl;
     
     return 0;
}