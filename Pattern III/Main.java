#include<iostream>
#include <bits/stdc++.h>
#include<sstream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    string s[n];
    
    //int x=1;
    //n+=1;
    for(int i = 1; i <=n;i++)
    {
        string temp = "";
        /*if(i%2==0)
        {
            x+=i-1;
        }*/
      //cout<<x<<"\n";
        for(int j = 1; j<=i;j++)
        {
            stringstream ss;
            ss<<i;
            temp+=ss.str();
            cout<<i;
            if (j!=i)
            {
                temp+='*';
                cout<<'*';
            }
            
            
            /*if(i%2==0)
            {
                x--;
            }
            else{
                x++;
            }*/

        }
       // if(i%2==0)
        //x+=i+1;
        s[i-1] = temp;
        cout<<"\n";
         //x+=1;
    }
    //cout<<s<<"\n";
    for(int i =n-1;i>=0;i--)
    cout<<s[i]<<"\n";
    return 0;
}