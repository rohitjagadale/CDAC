
// segmentation error occures need to modify 


#include <iostream>
#include <vector>
using namespace std;

class Course {
private:
    string course_name;
    int fees;

public:
    Course(string name, int fees)
    {
        this->course_name=name;
        this->fees=fees;
    }

    string getName() {
        return course_name;
    }

    int getFees() {
        return fees;
    }
};

class Student {
private:
    string name;
    int rollno;
    string mobile;
    vector<Course*> courses;

public:
    Student(string name, int rollno, string mobile)
    {
        this->name=name;
        this->rollno=rollno;
        this->mobile=mobile;
    }

    string getName() {
        return name;
    }

    int getRollNo() {
        return rollno;
    }

    string getMobile() {
        return mobile;
    }

    void takeCourse(Course* course) {
        courses.push_back(course);
    }

    void displayCourses() {
        if (courses.size() == 0) {
            cout << "No courses taken yet." << endl;
            return;
        }

        cout << "Courses taken by " << name << ":" << endl;
        for (Course* course : courses) {
            cout << "Course Name: " << course->getName() << ", Fees: " << course->getFees() << endl;
        }
    }
};

int main() {
    vector<Student*> students;
    vector<Course*> courses;

    // Creating some sample courses
    courses.push_back(new Course("Math", 1000));
    courses.push_back(new Course("Science", 1200));
    courses.push_back(new Course("English", 800));

    int choice;
    do {
        cout << "\nMenu:" << endl;
        cout << "1. Register Student" << endl;
        cout << "2. Take Course" << endl;
        cout << "3. Display Specific Student's Taken Courses" << endl;
        cout << "4. Display All Students and Their Courses" << endl;
        cout << "5. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                string name, mobile;
                int rollno;
                cout << "Enter Name: ";
                cin >> name;
                cout << "Enter Roll No: ";
                cin >> rollno;
                cout << "Enter Mobile: ";
                cin >> mobile;
                students.push_back(new Student(name, rollno, mobile));
                break;
            }
            case 2: {
                int studentIndex, courseIndex;
                cout << "Enter Student Index: ";
                cin >> studentIndex;
                cout << "Enter Course Index: ";
                cin >> courseIndex;
                students[studentIndex]->takeCourse(courses[courseIndex]);
                break;
            }
            case 3: {
                int studentIndex;
                cout << "Enter Student Index: ";
                cin >> studentIndex;
                students[studentIndex]->displayCourses();
                break;
            }
            case 4: {
                for (int i = 0; i < students.size(); i++) {
                    cout << "Student Name: " << students[i]->getName() << ", Roll No: " << students[i]->getRollNo() << ", Mobile: " << students[i]->getMobile() << endl;
                    students[i]->displayCourses();
                }
                break;
            }
            case 5: {
                // Clean up memory
                for (Student* student : students) {
                    delete student;
                }
                for (Course* course : courses) {
                    delete course;
                }
                return 0;
            }
            default:
                cout << "Invalid choice. Please try again." << endl;
                break;
        }
    } while (choice != 5);

    return 0;
}
