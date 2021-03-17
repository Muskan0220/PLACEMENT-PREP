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
    
    int s=0,e=n-1;
    while(s<=e){
        int m=(s+e)/2;
        if(a[m]==key){
            cout<<key<<" found at "<<m<<" index.";
            break;
        }
        else if(a[m]<key){
            s=m+1;
        }
        else{
            e=m-1;
        }
    }
    
 
}