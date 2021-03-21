#include<iostream>
#include<string>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
#endif


// initialization ways
string s0;
cin>>s0;
string s1("hello");
string s2 = "hello world";
string s3(s2);
string s4=s3;

//string insitialization from  a character array
char a[]={'a','b','c','d','e','\0'};
string s5(a);

cout<<s0<<endl;
cout<<s1<<endl;
cout<<s2<<endl;
cout<<s3<<endl;
cout<<s4<<endl;
cout<<s5<<endl;



}