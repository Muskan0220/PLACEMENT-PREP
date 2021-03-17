//pair of elements with a particular given sum.
#include<iostream>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif
    int n,key,csum;
    cin>>n;
    int a[100];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int sum=16;
    int i=0,j=n-1;
    while(i<j){
        csum=a[i]+a[j];
        if(csum>sum){j--;}
        else if(csum<sum){i++;}
        else if(csum==sum){
            cout<<a[i]<<" and "<<a[j]<<endl;
            i++;
            j--;

            }
    }

}