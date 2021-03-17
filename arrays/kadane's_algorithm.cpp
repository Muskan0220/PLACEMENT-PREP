#include<iostream>

using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif

    int n,key;
    cin>>n;
    int a[100];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int csum=0,msum=0;
    for(int i=0;i<n;i++){
        csum=csum+a[i];
        if(msum<csum){
            msum=csum;
        }else if(csum<0){csum=0;}          
    }
    cout<<"largest sum of contiguous subarray is "<<msum;
}