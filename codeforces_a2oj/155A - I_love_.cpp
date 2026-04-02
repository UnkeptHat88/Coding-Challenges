#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,min,max;
	cin>>n;
	int a[n],c=0;
	cin>>a[0];
	min=max=a[0];
	for(int i=1;i<n;i++){
		cin>>a[i];
		if(a[i]<min){
			min=a[i];
			c+=1;
		}
		if(a[i]>max){
			max=a[i];
			c+=1;
		}
	}
	cout<<c<<endl;
	return 0; 
}
