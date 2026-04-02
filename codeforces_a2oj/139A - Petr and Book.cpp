#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n;
	cin>>n;
	int w[n];
	for(int i=0;i<7;i++){
		cin>>w[i];
	}
	int i;
	while(n>0){
		for(i=0;i<7&&n>0;++i){
			n-=w[i];
		}
	}
	cout<<i<<endl;

	return 0; 
}
