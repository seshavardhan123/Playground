#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int f = 0, f1 = 1, f2 = 0;
    if (n==1)
    cout<<"0";
    else if (n==2)
    {
        cout<<"1";
    }
    else
    {
        n-=2;
         while(n!=0)
        {
            f= f1+f2;
            f2 = f1;
            f1 = f;
            n-=1;
        }
        cout<<f;

    }
    
    
   
}