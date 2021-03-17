#include<iostream>
#include<climits>
using namespace std;
void selection_sort(int a[],int n);
void selection_sort(int a[],int n){
for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i;j<n;j++){
            if(a[j]<a[min]){
                min=j;
            }
        }
        swap(a[i],a[min]);

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
    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
    }
    selection_sort(a,n);
    for (int i = 0; i < n; i++)
    {
        cout<<a[i]<<endl;
    }
    


    

}