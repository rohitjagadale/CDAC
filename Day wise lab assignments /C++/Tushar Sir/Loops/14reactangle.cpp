#include <iostream>
using namespace std;

int main(){
   int length, width, i, j;

    cout<<"Enter the length and width of the rectangle : ";
    cin>>length>>width;

    for(i=0;i<width;i++)
    {
        for(j=0;j<length;j++)
        {
            if( j==0 || j==length-1 || i==0 || i==width-1 )
            {
                cout<<'*';
            }
            else
            {
                cout<<" ";
            }
        }
        cout<<endl;
    }


    return 0;
}