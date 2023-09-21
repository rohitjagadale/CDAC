#include <iostream>
using namespace std;

int main(){
    int i,j,k;
    for(int i=1;i<=3;i++ ){
        for(int j=1;j<=3;j++){
            for(int k=1;k<=3;k++){
                if(i!=j && i!=k && j!=k){
                    cout<<i<<j<<k<<endl;
                }
            }
        }
    }

    return 0;
}