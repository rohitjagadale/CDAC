#include <iostream>
using namespace std;

int main() {

  int number;
  bool is_prime = true;

  cout << "Enter a positive integer: ";
  cin >> number;

  // 0 and 1 are not prime numbers
  if (number == 0 || number == 1) {
    is_prime = false;
  }

  // loop to check if n is prime
  for (int i = 2; i <= number/2; ++i) {
    if (number % i == 0) {
      is_prime = false;
      break;
    }
  }

  if (is_prime)
    cout << number << " is a prime number";
  else
    cout << number << " is not a prime number";

  return 0;
}