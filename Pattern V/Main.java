#include<iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int bot = (n*(n+1));
    int top = 1;
    for(int i = 0; i < n; i++)
    {
        //int count = 0;
        for(int j = 1; j <= i; j++)
        cout<<"--";
        for(int j = 1; j <= n-i; j++)
        {
            cout<<top<<"*";
            top += 1;
        }
        
        bot -= n-i;
        int temp = bot;
        for(int j = 1; j <= n-i; j++)
        {
            temp+=1;
            cout<<temp;
            if(j!=n-i)
            cout<<"*";
        }
        cout<<"\n";

    }
}