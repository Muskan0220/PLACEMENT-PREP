#include<iostream>
#include<cstring>
using namespace std;

char *tokenize(char *s,char delim){
    //string and single character acts as a delimiter
    static char *input=NULL;
    if(s!=NULL){
        //making the first function call
        input=s;
    }
    //after the last token is being extracted
    if (input==NULL)
    {
        return NULL;
    }
    
    //start extracting tokens and store them in an array
    char *arr=new char[strlen(input+1)];
    int i;
    for ( i = 0; input[i] !='\0'; i++)
    {
        if (input[i]!=delim)
        {
            arr[i]=input[i];
        }
        else{
            arr[i]='\0';
            input=input+i+1;
            return arr;
        }
        
    }
    //corner case
    arr[i]='\0';
    input=NULL;
    return arr;  
}
int main()
{
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
#endif

    char s[100]="Today ,is a,rainy day";
    char *ptr = tokenize(s,',');
    cout<<ptr<<endl;
    while(ptr!=NULL){
        ptr=tokenize(NULL,',');
        cout<<ptr<<endl;
    }

    

}