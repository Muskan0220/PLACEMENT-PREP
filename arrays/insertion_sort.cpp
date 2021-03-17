#include<iostream>

using namespace std;
void insertion_sort(int a[],int n);

void insertion_sort(int a[],int n){
    int key,j;
    for(int i=1;i<n;i++){
        key=a[i];
        j=i-1;
        while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }    
}
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
    insertion_sort(a,n);
    for(int i=0;i<n;i++){
        cout<<a[i]<<endl;
    }
}