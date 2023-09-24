#include<iostream>
using namespace std;
// rectangle
void area_peri(int *area,int *per)
{
   int length,width;
   cout<<"Enter the length and width of rectangle : "<<endl;
   cin>>length>>width;
   *area=length*width;
   *per=2*(length+width);
      
}

//circle
void area_circum(float *area,float *circum)
{
  
  int rad;
  float pi= 3.142;
  cout<<"Enter the radius of the circle: "<<endl;
  cin>>rad;
  
  *area=pi*rad*rad;
  *circum=2*pi*rad;
  
}

int main()
{
    int area_rec;
    int per_rec;
  
    float area_cir;
    float circum_cir;
    
    int choice;
    
    while(true){
    
    cout<<"Enter your choice : \n 1. For Rectangle \n 2. For circle \n 0. For Exit"<<endl;
    cin>>choice;  
    
    
    switch(choice)
    {
      case 1:      
      area_peri(&area_rec,&per_rec);
      cout<<"area of rec is "<<area_rec<<" and perimeter is "<<per_rec<<endl;
      break;
      
      case 2:
      area_circum(&area_cir,&circum_cir);
      cout<<"Area of circle is "<<area_cir<<" and circumference of circle is "<<circum_cir<<endl;
      
      
      case 0:
      exit(1);
      
    }
    };
    
    return 0;
  
  
  
}