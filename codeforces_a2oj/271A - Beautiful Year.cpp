
#include<bits/stdc++.h>
using namespace std;
 
int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
 
	int a;
	cin>>a;
	string s;
	for(int i=a+1;i<=10000;++i){
		s=to_string(i);
		if(s[0]!=s[1]&&s[0]!=s[2]&&s[0]!=s[3]&&s[1]!=s[2]&&s[1]!=s[3]&&s[2]!=s[3]){
			cout<<s;
			break;
		}
	}
	return 0;
 
}
