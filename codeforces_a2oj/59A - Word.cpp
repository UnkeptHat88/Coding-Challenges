#include<bits/stdc++.h>
using namespace std;
 
int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
 
	int n=0;
	string s;
	cin>>s;
	for(int i=0;i<s.length();i++){
		if(isupper(s[i])){
			n+=1;
		}
	}
	char ch;
	if(n>s.length()/2){
		for(int i =0;i<s.length();i++){
			ch=toupper(s[i]);
			cout<<ch;
		} 
	}
	else{
		for(int i =0;i<s.length();i++){
			ch=tolower(s[i]);
			cout<<ch;
		}
	}
 
	return 0;
 
}
