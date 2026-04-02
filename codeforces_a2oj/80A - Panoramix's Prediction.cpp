// good code for their constraints

#include <iostream>
using namespace std;
int a, b, h = 0;
int mas[16] = {
        2,
        3,
        5,
        7,
        11,
        13,
        17,
        19,
        23,
        29,
        31,
        37,
        41,
        43,
        47
};
int main() {
    cin >> a >> b;
    for (int i = 0; i < 15; i++) {
        if (a == mas[i] && b == mas[i + 1]) {
            h++;
            break;
        }
    }
    if (h == 0) {
        cout << "NO";
    } else {
        cout << "YES";
    }
}

//code if no constraints present

#include<bits/stdc++.h>
using namespace std;

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	int n,k,l;
	bool prime=false;
	cin>>n>>k;
	for(int i=n+1;i<=k;i++){
		for(int j=2;j<i;j++){
			if(i%j==0){
				prime=false;
				break;
			}prime=true;
		}
		if(prime){
			l=i;
			break;
		}
	}
	if(l==k){
		cout<<"YES"<<endl;
		return 0;
	}cout<<"NO"<<endl;
	return 0; 
}
