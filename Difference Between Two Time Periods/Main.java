#include<iostream>
//#include<cstdlib>

using namespace std;

struct time1
{
    int hr, min, sec;

};

int main()
{
    struct  time1 a, b;

    cin>>a.hr>>a.min>>a.sec;
    cin>>b.hr>>b.min>>b.sec;
    
    if(a.sec < b.sec)
    {
        a.sec += 60;
        a.min -= 1;
    }
    if(a.min < b.min)
    {
        a.min += 60;
        a.hr -= 1;
    }
    cout<<(a.hr-b.hr) <<":"<<(a.min-b.min)<<":"<<(a.sec-b.sec);  

}