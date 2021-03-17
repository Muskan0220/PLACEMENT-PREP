#include<iostream>
#include<climits>
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
    int max=INT_MIN,min=INT_MAX;
    for(int j=0;j<n;j++){
        if(a[j]>max){
            max=a[j];
        }
        if(a[j]<min){
            min=a[j];
        }
 
    }
    cout<<"largest number "<<max<<endl;
    cout<<"smallest number "<<min<<endl;
}