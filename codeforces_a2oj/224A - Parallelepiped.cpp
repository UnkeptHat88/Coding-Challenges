#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int lxb,bxh,lxh;
	cin>>lxb>>bxh>>lxh;
	int b=sqrt(lxb*bxh/lxh);
	int l=lxb/b,h=lxh/l;
	cout<<4*(b+l+h)<<endl;

	return 0; 
}
