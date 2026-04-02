#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int a;
	float c,d=0;
	cin>>a;
	for(int i=0;i<a;i++){
		cin>>c;
		d+=c;
	}
	cout<<d/a;
	return 0; 
}
