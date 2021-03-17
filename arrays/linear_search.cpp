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
    cout<<"Enter the number you want to search"<<endl;
    cin>>key;
    for(int j=0;j<n;j++){
        if(key==a[j]){
            cout<<key<<" found at "<<j<<" index.";
            break;
        }
        if(j==n-1){
            cout<<key<<" is not found in the array.";
        }
    }
}