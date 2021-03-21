#include<iostream>
#include<cstring>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
#endif

   char s[100]="Today is a rainy day.";
    char *ptr = strtok(s," ");
    cout<<ptr<<endl;
    while(ptr!=NULL){
        ptr=strtok(NULL," ");
        cout<<ptr<<endl;
    }
    cout<<s<<endl;

    

}