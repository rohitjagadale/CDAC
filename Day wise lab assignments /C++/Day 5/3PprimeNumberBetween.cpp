#include <iostream>
using namespace std;
void isPrime(int start, int end)
{
    int prime;
    for (int i = start; i <= end; i++)
    {

        for (int j = 2; j < i; j++)
        {
            prime = 1;
            if (i % j == 0)
            {
                prime = 0;
                break;
            }
        }
        if (prime == 1)
        {
            cout << i << endl;
        }
    }
}

int main()
{

    int start, end;
    cout << "Enter the starting and Ending number seprated by space:";
    cin >> start >> end;
    isPrime(start, end);

    return 0;
}