#include<iostream>
using namespace std;
int fact(int n);
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}

int fact(int n)
{
  int m = 1;
  for(int i = 2; i <= n; i++)
    m *= i;
  return m;
}