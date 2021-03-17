#include<iostream>

using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif
//Print elements of an array
    int a[10]={1,2,3};
    for(int i=0;i<10;i++){
        cout<<a[i]<<endl;
    }
//size of an array
cout<<sizeof(a)<<endl;
//number of elements in an array
cout<<sizeof(a)/sizeof(int)<<endl;
//update a single index of an array
a[9]=20;
cout<<a[9];

}