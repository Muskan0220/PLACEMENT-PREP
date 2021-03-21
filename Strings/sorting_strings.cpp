#include<iostream>
#include<algorithm>
#include<string>
using namespace std;
bool compare(string a,string b){
    if(a.length()==b.length()){
        return a<b;
    }
    return a.length()<b.length();
}
int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
#endif

    string s[10000];
    int n;
    cin>>n;
    cin.get();
    for (int i = 0; i < n; i++)
    {
        getline(cin,s[i]);
    }
    //normal sort i.e sorting lexicographically
    // sort(s,s+n);
    // for (int i = 0; i < n; i++)
    // {
    //     cout<<s[i]<<endl;
    // }
    
    //sorting based on the length of the strings
    sort(s,s+n,compare);
    for (int i = 0; i < n; i++)
    {
        cout<<s[i]<<endl;
    }


   
    

}