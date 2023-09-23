#include <iostream>
using namespace std;
#include <cstring>

class Employee{

    private:
       int employee_id;
       char employee_name[20];
       float employee_salary;

    public:
        Employee();
        Employee(int , char*,double);
       void Accept();
       void Display();
       void Update();
       int getID();


};


Employee::Employee(){

    }

    Employee::Employee(int id,char *n,double sal ){
            employee_id=id;
            strcpy(employee_name,n);
            employee_salary=sal;
    }

    void Employee::Accept(){
        cout<<"Enter the info"<<endl;
        cout<<"Enter the Employee ID"<<endl;
        cin>>employee_id;
        cout<<"Enter th Employee Name"<<endl;
        cin>>employee_name;
        cout<<"Enter the Employee Salary"<<endl;
        cin>>employee_salary;
    }

    void Employee::Display(){
        
        cout<<employee_id<<" "<<employee_name<<" "<<employee_salary<<endl;
    }
    void Employee::Update(){
          cout<<"Enter the employee name"<<endl;
       cin>>employee_name;
        cout<<"Enter the employee salary"<<endl;
        cin>>employee_salary;
    }

    int Employee::getID(){
        return employee_id;
    }

int main(){
        Employee e[10];
        int choise,count=0,id,i;
while(true){
        cout<<"1. Insert Record"<<endl;
        cout<<"2. Update Record(based on id)"<<endl;
        cout<<"3. Display All Records"<<endl;
        cout<<"4. Exit"<<endl;
        cin>>choise;
        switch(choise){
            case 1:
                e[count++].Accept();
                break;
            case 2:
                cout<<"Enter id of employee to be updated"<<endl;
                cin>>id;
                for(i=0;i<count;i++){
                if(id==e[i].getID())
            {
                e[i].Update();
            }
        }
            case 3:
              for ( i = 0; i < count; i++)
            {
                e[i].Display();
            }
            break;
            case 4:
            exit(0);
        }

}



    return 0;
}
