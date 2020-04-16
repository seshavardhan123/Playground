#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float x = 0.5f;
  while(n!=0)
  {
    cout<<x<<" ";
    x *= 3;
    n--;
  }
}