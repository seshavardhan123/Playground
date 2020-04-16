#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int x = 0, count = 0,diff = 0;
  if (n==0)
    return 0;
  else if (n==1)
  {
    cout<<"0";
    return 0;
  }
    
  if (n>=2)
  {
    cout<<"0 2 ";
    n-=2;
    x = 8;
    diff = 6;
  while(n!=0)
  {
    cout<<x<<" ";
    count++;
    if(count==2)
    {
      diff += 4;
      count = 0;
    }
    x+=diff;
    n--;
    
    
  }
}
}