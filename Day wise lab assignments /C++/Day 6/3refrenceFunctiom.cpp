#include <iostream>
using namespace std;
  
void incrementByOne(int &x) 
{
  x++;
}

int main(){
    int num=10;
    cout<<num<<endl;
    incrementByOne(num);
    cout<<num<<endl;
    return 0;
}