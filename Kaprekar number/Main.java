#include<iostream>
#include<math.h>
#include<string>
#include<bits/stdc++.h>
#include<sstream>
using namespace std;

int main()
{
    int num;
    cin>>num;
    stringstream ss;
    string s ;
    ss<<num;
    s =ss.str();
    int len = s.length();
    /*if (len%2==0)
    len/=2;
    else
    {
        len = (len/2)+1;
    }*/
    //cout<<"Half length is "<<len<<"\n";
    
    int num_sq = num*num;
    //cout<<"square of no is"<<num_sq<<"\n";
    int p = pow(10,len);
    int x = num_sq%p;
    //cout<<x<<"\n";
    p = pow(10,len);
    int y= num_sq/p;
    //cout<<y<<"\n";
    //cout<<x+y;
    if (x+y==num)
    cout<<"Kaprekar Number";
    else
    {
        cout<<"Not a Kaprekar Number";
    }
    


}