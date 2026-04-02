#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n;
	cin>>n;
	if(n%2==1){
		cout<<-1<<endl;
		return 0;
	}
	int a[n+1];
	for(int i=1;i<n+1;i+=2){
		a[i]=i+1;
		a[i+1]=i;
		cout<<a[i]<<' '<<a[i+1]<<' ';
	}

	return 0; 
}
