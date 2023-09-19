// 1. Given a positive integer N, find all factors of N.
// For example:
// N = 12
// Factors = 1 2 3 4 6 12
// N = 5
// Factors = 1 5

#include <iostream>
using namespace std;

int main()
{

    int num;
    do{
          cout << "Enter the number that you wants its facors";
    cin >> num;
    if(num<=0){
         cout << "Invalid Input. enter number grater than 0." << endl;
        cout << "Enter a number grater than 0 : ";
        cin >> num;
    }
    }while (num<=0);
  
    

    for (int i = 1; i <= num; i++)
    {
        if (num % i == 0)
        {
            cout << i << " ";
        }
    }

    return 0;
}