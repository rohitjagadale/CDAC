#include <bits/stdc++.h>
using namespace std;
class Member {
  public:
    // Data  Members
    string memberName;
    
};
int main()
{
    // Declare an object of class geeks
    Member obj1;
    // accessing data member
    obj1.memberName = "Rohit";
    // accessing member function
   cout<<obj1.memberName;
    return 0;
}