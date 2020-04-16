#include<iostream>
using namespace std;
int main()
{
  //Type your code here.rge
  int target =0 ;
  cin>>target;
  int count = 0,sum= 0 ;
  while(1)
  {
    int x;
    cin>>x;
    sum+=x;
    count++;
    if(sum>=target)
    {
      cout<<"The number of turns is "<<count;
      break;
    }
  }
  
}