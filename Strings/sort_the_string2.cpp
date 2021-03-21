#include<iostream>
#include<algorithm>
#include<cstring>
#include<string>
#include<utility>
using namespace std;
bool numcompare(pair<string,string> s1,pair<string,string> s2){
    return stoi(s1.second)< stoi(s2.second);
}
bool lexicompare(pair<string,string> s1,pair<string,string> s2){
    return s1.second< s2.second;
}

string extractAtKey(string str,int key){
    char *s = strtok((char*)str.c_str()," ");
    while(key>1){
        s=strtok(NULL," ");
        key--;
    }
    return (string)s;


}

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
#endif

    int n,j=1;
    cin>>n;
    string s[n],s2,s3[3];
    cin.get();
    for (int i = 0; i < n; i++)
    {
    getline(cin,s[i]);
    }
    int key;
    string reverse,order;
    cin>>key>>reverse>>order;
    pair<string,string> spair[100000];
    for (int i = 0; i < n; i++)
    {
        spair[i].first=s[i];
        spair[i].second=extractAtKey(s[i],key);
    }
    
    if(order=="numeric"){    
        sort(spair,spair+n,numcompare);
    }
    else if(order=="lexicographic"){
        sort(spair,spair+n,lexicompare);
    }
    
    if(reverse=="true"){
            for (int i = n-1; i >=0; i--)
    {
        cout<<spair[i].first<<" ";
    }
    }
  
    for (int i = 0; i < n; i++)
    {
        cout<<spair[i].first<<" ";
    }

    


    

    


}
