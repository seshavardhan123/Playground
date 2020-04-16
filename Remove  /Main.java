#include<iostream>
#include<string>
#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str1;
    getline(cin, str1);
    int i = 0, ind;
    while(str1[i]!='\0')
    {

         ind = str1.find("the", i);
        if(ind != string::npos)
        {
            //cout<<ind<<"\n";
            str1.replace(ind, 4, "");
            i = ind+1;

        }
        else
        {
            i++;
        }
        
        
        
    }
    cout<<str1;
}