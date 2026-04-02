#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,m,j=-1,d=0,max=0,mi;
	double a;
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>a;
		if(ceil(a/m)>=d){
			d=ceil(a/m);
			j=i;
		}
		if(a>=max){
			max=a;
			mi=i;
		}
	}
	if(j!=-1){
		cout<<j+1<<endl;
	}else{
		cout<<mi+1<<endl;
	}
	return 0; 
}
