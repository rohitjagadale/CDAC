#include <iostream>

class Date {
private:
    int day;
    int month;
    int year;

public:
    Date() : day(1), month(1), year(2000) {}

    Date(int d, int m, int y) : day(d), month(m), year(y) {}

    void Read() {
        std::cout << "Enter day, month, and year (e.g., 21 9 2023): ";
        std::cin >> day >> month >> year;
    }

    void Write() {
        std::cout << day << "/" << month << "/" << year;
    }

    bool operator==(const Date& obj2) {
        return (day == obj2.day && month == obj2.month && year == obj2.year);
    }

    bool operator!=(const Date& obj2) {
        return !(*this == obj2);
    }

    bool operator<(const Date& obj2) {
        if (year < obj2.year)
            return true;
        else if (year == obj2.year && month < obj2.month)
            return true;
        else if (year == obj2.year && month == obj2.month && day < obj2.day)
            return true;
        else
            return false;
    }

    bool operator<=(const Date& obj2) {
        return (*this < obj2 || *this == obj2);
    }

    bool operator>(const Date& obj2) {
        return !(*this <= obj2);
    }

    bool operator>=(const Date& obj2) {
        return !(*this < obj2);
    }
};

int main() {
    Date date1, date2;

    std::cout << "Enter the first date:" << std::endl;
    date1.Read();

    std::cout << "Enter the second date:" << std::endl;
    date2.Read();

    std::cout << "Date 1: ";
    date1.Write();
    std::cout << std::endl;

    std::cout << "Date 2: ";
    date2.Write();
    std::cout << std::endl;

    if (date1 == date2) {
        std::cout << "Date 1 is equal to Date 2." << std::endl;
    } else if (date1 < date2) {
        std::cout << "Date 1 is earlier than Date 2." << std::endl;
    } else {
        std::cout << "Date 1 is later than Date 2." << std::endl;
    }

    return 0;
}

