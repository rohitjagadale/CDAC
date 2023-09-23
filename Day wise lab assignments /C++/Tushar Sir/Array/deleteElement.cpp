#include <iostream>
using namespace std;
int main()
{
    int arr[5] = {}; //1
    
    cout<<"Enter 5 elements\n";   //2
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];
    }
    
    int ind, maxsize=5;  //3
    
    cout<<"Enter index to be deleted\n";  //4
    cin>>ind;
    
    if(ind<0 || ind>=maxsize)  //5
    {
        cout<<"Invalid\n";
    }
    else
    {
        for(int i=ind;i<=maxsize-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[maxsize-1]={};
    }
    
    cout<<"Array is:\n";  //6
    for(int i=0;i<5;i++)
    {
        if(arr[i]!='\0')
            cout<<arr[i]<<" ";
    }
}