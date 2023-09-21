#include <iostream>
using namespace std;

int main() {
    int num1, num2, num3;

  
    cout << "Enter three numbers: ";
    cin >> num1 >> num2 >> num3;
    int max;

    if(num1>=num2 && num1>=num3){
        max=num1;
    }else{
        max=num3;
    }

    if(num2>=num1 && num2>=num3){
        max=num2;
    }else{
        max=num3;
    }

  
    cout << "The maximum number is: " << max;

    return 0;
}