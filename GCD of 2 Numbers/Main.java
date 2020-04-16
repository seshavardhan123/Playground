#include<iostream>

using namespace std;

int gcd(int a, int b)
{
    static int mini = min(a,b);
    if(a%mini==0 && b%mini==0)
    return mini;
    mini -= 1;
    return gcd(a,b);
}

int main()
{
    int a, b;
    cin>>a>>b;
    cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}