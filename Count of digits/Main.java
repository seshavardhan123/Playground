#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n, count = 0;
  cin>>n;
  if (n ==0)
  {
    cout<<"1";
    return 0;
  }
  
  while(n!=0)
  {
    count++;
    n/=10;
  }
  cout<<count;
  return 0 ;
}
