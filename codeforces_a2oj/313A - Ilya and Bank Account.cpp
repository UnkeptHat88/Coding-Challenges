#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n;
	cin>>n;
	if(n>=0){
		cout<<n<<endl;
		return 0;
	}
	string sl = to_string(-(n%100-n%10)/10);
	string l = to_string(-n%10);
	string s = to_string(-n/100);
	int t1 = stoi(s+sl);
	int t2 = stoi(s+l);
	if(t1<=t2){
		cout<<-t1<<endl;
	}else{
		cout<<-t2<<endl;
	}
	return 0; 
}
