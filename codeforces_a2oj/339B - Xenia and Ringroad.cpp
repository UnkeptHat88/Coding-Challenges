#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,m;
	cin>>n>>m;
	int a[m];
	for(int i=0;i<m;i++){
		cin>>a[i];
	}
	int tr=0,h=a[0]+1;
	long long int t=0;
	for(int i=0;i<m;i++){
		if(a[i]<h){
			t+=a[i]-1+tr;
		}else{
			t+=a[i]-h;
		}
		tr=n-a[i]+1;
		h=a[i];
	}
	cout<<t<<"\n";

	return 0;
}
