#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int a[4],n=0;
	cin>>a[0]>>a[1]>>a[2]>>a[3];
	sort(a,a+4);
	for(int i=0;i<3;i++){
		if(a[i]==a[i+1]){
			n++;
		}
	}
	cout<<n<<endl;

	return 0; 
}
