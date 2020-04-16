#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int eve= 0, odd = 0;
  for(int i = 0; i< n; i++)
  {
    int x;
    cin>>x;
    if(x%2 == 0)
      eve += x;
    else
      odd += x;
  }
  cout<<"The sum of the even numbers in the array is "<<eve<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<odd;
}