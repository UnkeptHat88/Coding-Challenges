//to find n term in series 1 1 2 3 4 9 8 27 16 81..
//input :
// 10
// 1 2 3 4 5 6 7 9 10

#include <iostream>
using namespace std;

int fact(int n,int j){
    if(n==1){
        return 1;
    }
    if(n==2){
        return 1;
    }
    return j*fact(n-2,j);}
    
int main(){
    int n,t;
    cin>>t;
    for(int i=0;i<t;i++){
        cin>>n;
        if (n%2==0){
            
            cout<<fact(n,3)<<endl;
        }
        else{
            cout<<fact(n+1,2)<<endl;
        }
    }
    return 0;
}
