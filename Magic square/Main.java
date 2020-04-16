#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int arr[n][n];
  for(int i = 1; i <= n; i++)
    for(int j = 1; j <= n; j++)
  cin>>arr[i][j];
  int forward = 0, backward = 0;
  for(int i= 1; i <= n; i++)
  {
    forward+=arr[i][i];
    backward+=arr[n-i+1][i];
  }
  if(forward == backward)
  {
    cout<<"Yes";
  }
  else
    cout<<"No";
}