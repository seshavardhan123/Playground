#include<iostream>
using namespace std;
int main()
{
    int en, no;
    cin>>en>>no;
    no += en;
    en =1 ;
    for(int i = 2; i <no; i++)
    {
        if (no%i == 0)
        en+=i;
    }
    if(no == en)
    cout<<"They can read the message";
    else
    {
        cout<<"They can't read the message";
    }
    
}