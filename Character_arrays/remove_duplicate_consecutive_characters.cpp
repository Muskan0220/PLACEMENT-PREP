#include<iostream>
#include<cstring>
using namespace std;
void remove_duplicates(char a[]){
   int l=strlen(a);
   if(l==0||l==1){
       return;
   } 
   int j=0;
   for (int i = 0; i < l; i++)
   {
       if(a[i]!=a[j]){
           j++;
           a[j]=a[i];
       }
   }
   a[j+1]='\0';
   return;
   
}
int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif

    char a[100000];
    cin.getline(a,100000);
    remove_duplicates(a);
    cout<<a<<endl;
}