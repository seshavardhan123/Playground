#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  if (num ==0)
  {
    cout<<"No";
    return 0;
  }
  int ev_sum = 0, odd_sum =0, n = num, i =0 ;
  while(n!=0)
  {
    if (i%2==0)
      ev_sum += n%10;
    else
      odd_sum += n%10;
    n /= 10;
    i++;
  }
  if (ev_sum == odd_sum)
    cout<<"Yes";
  else
    cout<<"No";
}