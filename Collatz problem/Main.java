#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int st, count = 0 ;
  cin>>st;
  while (st!=1)
  {
    cout<<st<<"\n";
    if(st%2==0)
      st /= 2;
    else
      st = 3*st+1;
    count++;
  }
  cout<<st<<"\n";
  cout<<count<<"\n";
}
  
