#include <iostream>
using namespace std;
#include <cstring>
class  Employee
{
private:
    int emp_id;
    char emp_name[20];
    double salary;
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

Employee::Employee(int id,char *n, double s){
    emp_id=id;
    strcpy(emp_name,n);
    salary=s;
}

void Employee::Accept(){
    cout<<"Enter Info"<<endl;
    cout<<"Enter the employee id"<<endl;
     cin>>emp_id;
      cout<<"Enter the employee name"<<endl;
       cin>>emp_name;
        cout<<"Enter the employee salary"<<endl;
    
    cin>>salary;
}


void Employee::Display(){
    cout<<emp_id<<" "<<emp_name<<" "<<salary<<endl;
}

void Employee::Update(){
  cout<<"Enter the employee name"<<endl;
       cin>>emp_name;
        cout<<"Enter the employee salary"<<endl;
        cin>>salary;
}
int Employee::getID()
{
    return emp_id;
}

int main()
{
    Employee e[10];
    int choice,cnt=0,i,id;
    while (true)
    {
        cout<<"1. Insert Record"<<endl;
        cout<<"2. Update Record(based on id)"<<endl;
        cout<<"3. Display All Records"<<endl;
        cout<<"4. Exit"<<endl;
        cin>>choice;
        switch (choice)
        {
        case 1:
            e[cnt++].Accept();
            break;
        case 2:
        cout<<"Enter id of employee to be updated"<<endl;
        cin>>id;
        for(i=0;i<cnt;i++){
            if(id==e[i].getID())
            {
                e[i].Update();
            }
        }
        case 3:
            for ( i = 0; i < cnt; i++)
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