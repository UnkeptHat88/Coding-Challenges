#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,a1=0,b1=0,s=0;
	cin>>n;
	int a[n],b[n];
	for(int i=0;i<n;i++){
		cin>>a[i]>>b[i];
		a1+=a[i];
		b1+=b[i];
	}
	cout<<min(a1,n-a1)+min(b1,n-b1)<<endl;

	return 0; 
}
