//  Write a Student class and use it in your program. Store the data of 10 students and display
// the sorted data according to their roll numbers, dates of birth, and total marks.


#include <iostream>
using namespace std;

struct student
{
     int roll;
     string birth;
    int marks;
};

int main() 
{
    student s1;
    cout << "Enter information," << endl;
    cout << "Enter roll number: ";
    cin >> s1.roll;
    cout<<"Enter the Birth date in 01-01-2001  DD-MM-YYYY format";
    cin>>s1.birth;
    cout << "Enter marks: ";
    cin >> s1.marks;

    cout << "\nDisplaying Information," << endl;
    cout << "Name: " << s1.roll << endl;
    cout << "Roll: " << s1.birth << endl;
    cout << "Marks: " << s1.marks << endl;

     student s2;
    cout << "Enter information," << endl;
    cout << "Enter roll number: ";
    cin >> s2.roll;
    cout<<"Enter the Birth date in 01-01-2001  DD-MM-YYYY format";
    cin>>s2.birth;
    cout << "Enter marks: ";
    cin >> s2.marks;

    cout << "\nDisplaying Information," << endl;
    cout << "Name: " << s2.roll << endl;
    cout << "Roll: " << s2.birth << endl;
    cout << "Marks: " << s2.marks << endl;

     student s3;
    cout << "Enter information," << endl;
    cout << "Enter roll number: ";
    cin >> s3.roll;
    cout<<"Enter the Birth date in 01-01-2001  DD-MM-YYYY format";
    cin>>s3.birth;
    cout << "Enter marks: ";
    cin >> s3.marks;

    cout << "\nDisplaying Information," << endl;
    cout << "Name: " << s3.roll << endl;
    cout << "Roll: " << s3.birth << endl;
    cout << "Marks: " << s3.marks << endl;

     

    
    return 0;
}