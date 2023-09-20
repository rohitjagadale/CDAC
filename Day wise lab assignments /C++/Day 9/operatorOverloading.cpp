#include <iostream>
using namespace std;


class BigInt{

        int num;
        public:
                 BigInt(){

        }
        BigInt(int n):num(n){

        }

        public:
        bool operator==(BigInt obj2){
            if(num==obj2.num){
                return true;
            }else{
                return false;
            }
        }

        bool operator>(BigInt obj2){
            if(num>obj2.num){
                return true;
            }else{
                return false;
            }
        }

};

int main(){

BigInt obj1(10);
bool result=obj1.operator==(8);
if(result==1){
    cout<<"both are equal";
}else{
    result=obj1.operator>(8);

    if(result==1){
        cout<<"object 1 is greater than object two";
    }else{
        cout<<"ocject 2 is greatest";
    }

    return 0;
}}