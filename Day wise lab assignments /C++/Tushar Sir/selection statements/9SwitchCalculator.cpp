// Using switch-case construct, write a menu driven program to perform basic calculations (addition, subtraction, multiplication and division) on two user entered numbers.

using namespace std;

#include <iostream>

int main() {
    double num1, num2;
    char operation;

    cout << "Simple Calculator Menu:" << endl;
   cout << "1. Addition (+)" << endl;
    cout << "2. Subtraction (-)" << endl;
    cout << "3. Multiplication (*)" << endl;
    cout << "4. Division (/)" << endl;
    cout << "Enter your choice (1/2/3/4): ";
    cin >> operation;

    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    switch (operation) {
        case '1':
            cout << "Result: " << num1 + num2 <<endl;
            break;
        case '2':
            cout << "Result: " << num1 - num2 <<endl;
            break;
        case '3':
            cout << "Result: " << num1 * num2 << endl;
            break;
        case '4':
            if (num2 != 0) {
                cout << "Result: " << num1 / num2 <<endl;
            } else {
                cout << "Error: Division by zero is not allowed." << endl;
            }
            break;
        default:
            cout << "Invalid choice!" << std::endl;
    }

    return 0;
}