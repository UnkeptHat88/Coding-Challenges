#include<iostream>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int k,l,m,n,d;
	cin>>k>>l>>m>>n>>d;
	int dragons=d;
	if(k==1||l==1||m==1||n==1){
		cout<<d<<endl;
	}else{
		for(int i=1;i<=d;i++){
			if((i%k!=0) && (i%l!=0) && (i%m!=0) && (i%n!=0)){
				dragons--;
			}
		}cout<<dragons<<endl;
	}

	return 0; 
}
