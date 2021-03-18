#include<iostream>
#include<climits>
using namespace std;
void readline(char a[],int max,char c);
void readline(char a[],int max,char c){
    int count=0;
    char ch=cin.get();
    while(ch!='\n'){
        if(ch==c){break;}
        a[count]=ch;
        count++;
        if(count==max){break;}
        ch=cin.get();

    }
    a[count]='\0';
    return;
}
int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif

    char a[100000];
    readline(a,10000,'$');
    cout<<a<<endl;
    //an inbuilt method that does the same work as the above function
    //cin.getline(a,10000,'$)
    return 0;
}