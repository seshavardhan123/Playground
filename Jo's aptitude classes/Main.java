#include<iostream>
//#include<vector>

using namespace std;

/*bool comp(int a, int b)
{
    return a<b;
}*/

int main()
{
    int a, b, c, gcd;
    cin>>a>>b>>c>>gcd;
    int mini = min(min(a,b),c);
    while(1)
    {
        if(a%mini==0 && b%mini==0 && c%mini==0)
        {
            break;
        }
      mini--;
    }
    if (mini == gcd)
    cout<<"Answer is correct.";
    else
    {
        cout<<"Answer is wrong.";
        
    }
    
}