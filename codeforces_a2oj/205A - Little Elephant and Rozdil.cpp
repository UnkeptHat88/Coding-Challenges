#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n;
	cin>>n;
	int min_i=0,time,min_t(1000000001),count(0);
	for(int i=0;i<n;i++){
		cin>>time;
		if(time<min_t){
			min_t=time;
			min_i=i+1;
			count=1;
		}else if(time == min_t){
			count+=1;
		}
	}
	if(count!=1){
		cout<<"Still Rozdil"<<endl;
	}else{
		cout<<min_i<<endl;
	}
	return 0;
}
