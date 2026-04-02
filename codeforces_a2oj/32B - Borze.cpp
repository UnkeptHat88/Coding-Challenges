//input
// -..-.--
//output
// 1012


#include<bits/stdc++.h>
using namespace std;

#define MAX 200

class Stack{
	int _top;
public:
	char a[MAX];
	Stack(){_top=-1;}
	void push(char x){
		a[++_top]=x;
	}
	void disp(){
		for(int i=0;i<_top+1;i++){
			cout<<a[i];
		}
	}
};

int main(){

#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif

	string s;
	Stack lst;
	cin>>s;
	for(int i=0;i<s.length();i++){
		if(s[i]=='.'){
			lst.push('0');
		}
		if(s[i]=='-'&&s[i+1]=='.'){
			lst.push('1');
			i++;
		}
		if(s[i]=='-'&&s[i+1]=='-'){
			lst.push('2');
			i++;
		}
		
	}
	lst.disp();
	return 0;

}
