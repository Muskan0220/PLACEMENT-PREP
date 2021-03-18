#include<iostream>

using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif
    //without null stores a garbage value
    char s1[]={'h','e','l','l','l','o'};
    //with null
    char s2[]={'h','e','l','l','l','o','\0'};
    char s3[]="helllo";

    cout<<s1<<" "<<sizeof(s1)<<endl;
    cout<<s2<<" "<<sizeof(s2)<<endl;
    cout<<s3<<" "<<sizeof(s3)<<endl;
    
    

}