#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int x = 121;
  int diff = 0, i =1;
  while(i<=n)
  {
    cout<<x<<" ";
    if(i!=1)
    {
      diff+=32;
      x+=diff;
      //cout<<x<<" ";
    }
    else{
      diff = 104;
      x+=104;
    }
    i++;
  }
}