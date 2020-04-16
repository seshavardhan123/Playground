#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a[3],i = 2, lcm = 1;
    cin>>a[0]>>a[1]>>a[2];
    sort(a,a+3);
    //int min = a[0];

    while (i <= a[0])
    {
        if ((a[0]%i==0) && (a[1]%i)==0 && (a[2]%i)==0)
        lcm = i;
        i+=1;
    }
    cout<<"The treasure is in box which has number "<<a[1]<<"\n";
    cout<<"The code to open the box is "<<lcm;
}