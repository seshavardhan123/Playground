#include<iostream>
using namespace std;
int main()
{
    int st, en;
    cin>>st>>en;
    for(int i = st;i<=en; i++)
    {
        int sum = 0;
        for(int  j = 1; j < i; j++)
        {
            if (i%j ==0)
            sum+=j;
        }
        if (sum == i)
        cout<<i<<" ";
    }

}