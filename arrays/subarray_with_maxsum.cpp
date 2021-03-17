#include<iostream>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif

    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int maxsum=0;
    int start=-1,end=-1;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){ 
            int sum=0;  
            for(int k=i;k<=j;k++){
                sum=sum+a[k];
            }
            if(sum>maxsum){
                maxsum=sum;
                start=i;
                end=j;
            }

        }
    }
    cout<<"largest sum of subarray is "<<maxsum<<endl;
    for(int i=start;i<=end;i++){
        cout<<a[i]<<",";
    }
}