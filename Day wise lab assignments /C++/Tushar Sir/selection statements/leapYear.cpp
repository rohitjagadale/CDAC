#include <iostream>
using namespace std;

int main()
{
    int year;
    cout << "Enter the Year to check wether its leap year or not";
    cin >> year;

    // a] help of logical operator

    //       if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    //     cout << year << " is a leap year.";
    //   }
    //   else {
    //     cout << year << " is not a leap year.";
    //   }

    // b] help of conditional operator

    if (year % 400 == 0)
    {
        cout << year << " is a leap year."<<endl;
    }

    else if (year % 100 == 0)
    {
        cout << year << " is not a leap year."<<endl;
    }

    else if (year % 4 == 0)
    {
        cout << year << " is a leap year."<<endl;
    }

    else
    {
        cout << year << " is not a leap year."<<endl;
    }

    return 0;
}