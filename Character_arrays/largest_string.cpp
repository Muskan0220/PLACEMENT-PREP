#include<iostream>
#include<cstring>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif

    char a[10000],max[10000];
    int large=0;
    int n;
    cin>>n;
    //to avoid \n being read as a string
    cin.get();
    for (int i = 0; i < n; i++)
    {
        cin.getline(a,100000);
        int l=strlen(a);
        if(l>large){
            strcpy(max,a);
            large=l;
        }

    }
    cout<<"largest string is "<<max<<endl;
    cout<<"length of string is "<<large<<endl;
    
    

}