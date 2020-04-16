#include<iostream>

using namespace std;

int main()
{
    int r,c,p,q, x = 0;
    cin>>r>>c;
    p = r;
    q = c;
    int count = r*c;
    while(count>0)
    {
        count -= (p+q) - 1;
        x++;
    }
    if(x%2!=0)
    {
        cout<<"Arun Gupta";

    }
    else
    {
        cout<<"Mani Iyer";
    }
    
}