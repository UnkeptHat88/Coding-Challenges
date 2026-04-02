#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n;
	cin>>n;
	int a[n+1];
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	a[n]=a[0];
	for(int i=0;i<n;i++){
		a[i]=abs(a[i]-a[i+1]);	
	}
	int m=*min_element(a,a+n),j=0;
	
	for(int i=0;i<n;i++){
		if(m == a[i]){
			j=i+1;
			break;
		}
	}
	if(j==n){
		cout<<j<<" "<<1<<endl;
	}else{
		cout<<j<<" "<<j+1<<endl;
	}

	return 0;
}
