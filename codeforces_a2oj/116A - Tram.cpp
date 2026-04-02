#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,m,c;
	cin>>n;
	int a[n],b[n];
	cin>>a[0]>>b[0];
	c=m=b[0];
	for(int i=1;i<n;i++){
		cin>>a[i]>>b[i];
		c=c-a[i]+b[i];
		if(c>m){
			m=c;
		}
	}
	cout<<m<<endl;

	return 0; 
}
