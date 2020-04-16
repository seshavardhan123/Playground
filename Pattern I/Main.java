#include<iostream>
#include <bits/stdc++.h>
#include<sstream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    string s[4];
    
    int x=n;
    //n+=1;
    for(int i = 0; i <4;i++)
    {
        string temp = "";
      
        for(int j = 0; j<=i;j++)
        {
            stringstream ss;
            ss<<x;
            temp+=ss.str();
            cout<<x;
        }
        s[i] = temp;
        cout<<"\n";
         x+=1;
    }
    //cout<<s<<"\n";
    for(int i =3;i>=0;i--)
    cout<<s[i]<<"\n";
}