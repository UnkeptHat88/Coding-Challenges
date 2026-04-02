#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int n,k,l,c,d,p,nl,np;
	cin>>n>>k>>l>>c>>d>>p>>nl>>np;
	int a[3];
	a[0]=(k*l)/(n*nl);
	a[1]=(c*d)/n;
	a[2]=p/(n*np);
	cout<<*min_element(a, a + 3)<<endl;; 

	return 0; 
}
