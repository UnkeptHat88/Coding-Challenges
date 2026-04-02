#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	string s;
	int n=0;
	cin>>s;
	sort(s.begin(),s.end());
	for(int i=0;i<s.length()-1;i++){
		if(s[i]==s[i+1]){
			n+=1;
		}
	}
	if((s.length()-n)%2==1){
		cout<<"IGNORE HIM!"<<endl;
	}else{
		cout<<"CHAT WITH HER!"<<endl;
	}

	return 0; 
}
