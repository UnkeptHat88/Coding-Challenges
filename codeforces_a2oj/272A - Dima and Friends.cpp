#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n;
	cin>>n;
	int a,m=0;
	for(int i=0;i<n;i++){
		cin>>a;
		m+=a;
	}
	int k=0;
	for(int i=1;i<=5;i++){
		if((m+i-1)%(n+1) != 0){
			k++;
		}
	}
	cout<<k<<endl;
	return 0; 
}
