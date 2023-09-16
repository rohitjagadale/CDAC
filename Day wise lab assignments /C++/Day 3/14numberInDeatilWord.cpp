// 14. Given a positive integer N, print the number in words.
// For example:
// N = 5312
// Result = Five Thousand Three Hundred Twelve

#include <iostream>

void printDigitInWords(int digit) {
    switch (digit) {
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
}

void printNumberInWords(int N) {
    if (N == 0) {
        std::cout << "Zero";
        return;
    }

    // Extract and print thousands
    int thousands = N / 1000;
    if (thousands > 0) {
        printDigitInWords(thousands);
        std::cout << "Thousand ";
        N %= 1000;
    }

    // Extract and print hundreds
    int hundreds = N / 100;
    if (hundreds > 0) {
        printDigitInWords(hundreds);
        std::cout << "Hundred ";
        N %= 100;
    }

    // Print the rest (tens and ones)
    if (N > 0) {
        if (N >= 10 && N <= 19) {
            // Handle special case for numbers 10-19
            switch (N) {
                case 10:
                    std::cout << "Ten";
                    break;
                case 11:
                    std::cout << "Eleven";
                    break;
                case 12:
                    std::cout << "Twelve";
                    break;
                case 13:
                    std::cout << "Thirteen";
                    break;
                case 14:
                    std::cout << "Fourteen";
                    break;
                case 15:
                    std::cout << "Fifteen";
                    break;
                case 16:
                    std::cout << "Sixteen";
                    break;
                case 17:
                    std::cout << "Seventeen";
                    break;
                case 18:
                    std::cout << "Eighteen";
                    break;
                case 19:
                    std::cout << "Nineteen";
                    break;
            }
        } else {
            // Handle tens
            int tens = N / 10;
            if (tens > 0) {
                switch (tens) {
                    case 2:
                        std::cout << "Twenty ";
                        break;
                    case 3:
                        std::cout << "Thirty ";
                        break;
                    case 4:
                        std::cout << "Forty ";
                        break;
                    case 5:
                        std::cout << "Fifty ";
                        break;
                    case 6:
                        std::cout << "Sixty ";
                        break;
                    case 7:
                        std::cout << "Seventy ";
                        break;
                    case 8:
                        std::cout << "Eighty ";
                        break;
                    case 9:
                        std::cout << "Ninety ";
                        break;
                }
                N %= 10;
            }

            // Print the ones digit
            if (N > 0) {
                printDigitInWords(N);
            }
        }
    }
}

int main() {
    int N;
    std::cout << "Enter a positive integer: ";
    std::cin >> N;

    if (N <= 0) {
        std::cout << "Please enter a positive integer." << std::endl;
        return 1;
    }

    printNumberInWords(N);
    std::cout << std::endl;

    return 0;
}
