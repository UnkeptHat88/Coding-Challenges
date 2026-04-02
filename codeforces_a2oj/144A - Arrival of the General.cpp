#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,min=100,max=0,mni,mxi,p;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++){
		cin>>a[i];
		if(a[i]<=min){
			min=a[i];
			mni=i;
		}
		if(a[i]>max){
			max=a[i];
			mxi=i;
		}
	}
	p=mxi+(n-mni-1);
	if(mni<mxi){	
		p--;
	}cout<<p<<endl;
	return 0; 
}
