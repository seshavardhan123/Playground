#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int x =6, i = 1;
  while(n!=0)
  {
    cout<<x<<" ";
    x+=5*i;
    i++;
    n--;
    
  }
}