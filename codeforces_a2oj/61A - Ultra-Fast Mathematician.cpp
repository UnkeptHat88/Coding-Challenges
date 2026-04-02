#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	string a,b;
	cin>>a;
	cin>>b;
	for(int i=0;i<a.length();i++){
		if(a[i]!=b[i]){
			a[i]='1';
		}else{
		a[i]='0';
		}
	}

	cout<<a<<endl;

	return 0; 
}
