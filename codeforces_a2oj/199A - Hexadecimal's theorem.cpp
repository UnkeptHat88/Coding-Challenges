#include<bits/stdc++.h>
using namespace std;

int binarySearch(int arr[], int l, int r, int x) 
{ 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        if (arr[mid] == x) 
            return mid; 

        if (arr[mid] > x) 
            return binarySearch(arr, l, mid - 1, x); 

        return binarySearch(arr, mid + 1, r, x); 
    } 

    return -1; 
} 

int main(){
 
#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif
	
	int arr[46];
	arr[0]=0;
	arr[1]=1;

	for(int i=2;i<46;i++){
		arr[i]=arr[i-1]+arr[i-2];
	}
	int n,a,b,c;
	cin>>n;
	if(n==0){
		cout<<"0 0 0"<<"\n";
		return 0;
	}
	if(n==1){
		cout<<"0 0 1"<<"\n";
		return 0;
	}
	if(n==2){
		cout<<"0 1 1"<<"\n";
		return 0;
	}
	int i = binarySearch(arr,0,46,n);
	c=arr[i-1];
	b=arr[i-3];
	a=arr[i-4];
	cout<<a<<" "<<b<<" "<<c<<"\n";

	return 0;
}
