#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,q,index[100001];
	long long int x=0,y=0;
	cin>>n;
	int a;
	for(int i=1;i<=n;i++){
		cin>>a;
		index[a]=i;
	}
	cin>>q;
	while(q--){
		cin>>a;
		x+=index[a];
		y+=(n+1-index[a]);
	}
	cout<<x<<" "<<y<<endl;

	return 0; 
}
