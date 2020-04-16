#include<iostream>
#include<cmath>
using namespace std;

int main()
{
  int num;
  cin>>num;
  if (num <= 1)
  {
    cout<<"Not eligible";
    return 0;
  }
  int i = 2;
  for(i = 2; i <= (num)/2;i++)
  {
    if (num%i==0)
    {
      cout<<"Not eligible";
      return 0;
    }
  }
  
  cout<<"Eligible";
  
}