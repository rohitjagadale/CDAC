// 11. Given a positive integer N, check if it is an armstrong number or not.
// An armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
// For example:
// N = 153
// Number of digits in number = 3
// Sum of its own digits each raised to the power of the number of digits = (1 x 1 x 1) + (5 x 5 x 5) + (3 x 3 x 3) = 1 + 125 + 27 = 153
// 153 is armstrong number.


#include <cmath>
#include <iostream>

using namespace std;

int main() {
   int number, originalNum, remainder;
   int  n = 0, result = 0, power;
   cout << "Enter an integer: ";
   cin >> number;

   originalNum = number;

   while (originalNum != 0) {
      originalNum /= 10;
      ++n;
   }
   originalNum = number;

   while (originalNum != 0) {
      remainder = originalNum % 10;

      power = round(pow(remainder, n));
      result =result+ power;
      originalNum /= 10;
   }

   if (result == number)
      cout << number << " is an armstrong number.";
   else
      cout << number << " is not an armstrong number.";
   return 0;
}