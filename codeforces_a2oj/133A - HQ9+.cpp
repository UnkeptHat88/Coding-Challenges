#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	string s,s2="HQ9";
	cin>>s;
	for(int i=0;i<4;i++){
		size_t found = s.find(s2[i]); 
		if (found!=string::npos){
			cout<<"YES"<<endl;
			return 0;
		}
	}
	cout<<"NO"<<endl;

	return 0; 
}
