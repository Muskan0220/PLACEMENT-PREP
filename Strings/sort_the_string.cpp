#include<iostream>
#include<cstring>
#include<string>
using namespace std;

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
    if(n<100000){
    string s[n],s2,s3[3];
    cin.get();
    for (int i = 0; i < n; i++)
    {
    getline(cin,s[i]);
    }
    int key;
    string reverse,order;
    cin>>key>>reverse>>order;
    if(order=="numeric"){
        for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(stoi(extractAtKey(s[j],key))>stoi(extractAtKey(s[j+1],key))){
                swap(s[j],s[j+1]);
            }
        }
    } 
    }
    else if(order=="lexicographic"){
        for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(extractAtKey(s[j],key)>extractAtKey(s[j+1],key)){
                swap(s[j],s[j+1]);
            }
        }
    }
    }
    if(reverse=="true"){
            for (int i = n-1; i >=0; i--)
    {
        cout<<stoi(s[i])<<endl;
    }
    }else{
            for (int i = 0; i < n; i++)
    {
        cout<<stoi(s[i])<<endl;
    }

    }


    

    
    }

}
