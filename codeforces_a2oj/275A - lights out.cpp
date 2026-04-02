#include<bits/stdc++.h>
using namespace std;
 
int func(int x){
	if(x==1){
		return 0;
	}return 1;
}

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif

	int a[4][4],b[4][4];
	for(int i=0;i<3;i++){
		cin>>a[i][0]>>a[i][1]>>a[i][2];
		b[i][0]=b[i][1]=b[i][2]=1;
	}
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			if(a[i][j]%2==1){
				b[i][j]=func(b[i][j]);
				b[i][j+1]=func(b[i][j+1]);
				b[i][j-1]=func(b[i][j-1]);
				b[i+1][j]=func(b[i+1][j]);
				b[i-1][j]=func(b[i-1][j]);
			}
		}
	}
	for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				cout<<b[i][j];
			}cout<<endl;
		}
	return 0;
 
}
