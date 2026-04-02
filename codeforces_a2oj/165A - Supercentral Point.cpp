#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,count=0;
	bool a,b,c,d;
	cin>>n;
	int x[n],y[n];
	for(int i=0;i<n;i++){
		cin>>x[i]>>y[i];
	}
	for(int i=0;i<n;i++){
		a=0;b=0;c=0;d=0;
		for(int j=0;j<n;j++){
			if(x[i]>x[j] && y[i]==y[j]){a=1;}
			if(x[i]<x[j] && y[i]==y[j]){b=1;}
			if(x[i]==x[j] && y[i]>y[j]){c=1;}
			if(x[i]==x[j] && y[i]<y[j]){d=1;}
		}
		if(a && b && c && d){ count++;}
	}
	cout<<count<<endl;

	return 0; 
}
