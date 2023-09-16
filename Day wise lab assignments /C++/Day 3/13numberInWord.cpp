// 13. Given a positive integer N, print the digits in the number as words.
// For example:
// N = 231
// Result = Two Three One

#include <iostream>
using namespace std;

int main() {
    int N;
    cout << "Enter a positive integer: ";
    cin >> N;

    if (N <= 0) {
        cout << "Please enter a positive integer." << std::endl;
        return 1;
    }

    int digit;
    int reversed = 0;
    
    // Reverse the number
    while (N > 0) {
        digit = N % 10;
        reversed=reversed*10+digit;
        N =N/ 10;}
        int reminder;
        while(reversed>0){
            reminder=reversed%10;
            reversed=reversed/10;
        switch (reminder) {
            case 0:
                std::cout << "Zero ";
                break;
            case 1:
                std::cout << "One ";
                break;
            case 2:
                std::cout << "Two ";
                break;
            case 3:
                std::cout << "Three ";
                break;
            case 4:
                std::cout << "Four ";
                break;
            case 5:
                std::cout << "Five ";
                break;
            case 6:
                std::cout << "Six ";
                break;
            case 7:
                std::cout << "Seven ";
                break;
            case 8:
                std::cout << "Eight ";
                break;
            case 9:
                std::cout << "Nine ";
                break;
        }
        reminder=0;
    }


    return 0;
}
