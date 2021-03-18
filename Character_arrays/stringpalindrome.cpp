#include<iostream>
#include<cstring>
using namespace std;
bool is_palindrome(char a[]){
    int j=strlen(a)-1;
    int i=0;
    while(i<j){
        if(a[i]==a[j]){
            i++;
            j--;
        }else{return false;}
    }
    return true;

}

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif

    char a[100000];
    cin.getline(a,100000);
    bool c = is_palindrome(a);
    if(c){
        cout<<"the string is palindrome"<<endl;
    }else{
        cout<<"the string is not palindrome"<<endl;
    }

}