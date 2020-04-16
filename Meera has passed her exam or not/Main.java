#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n, key;
  cin>>n;
  int a[n];
  for(int i = 0; i < n ;i++)
  cin>>a[i];
  cin>>key;
  for(int i = 0; i < n ;i++)
  {
    if (key == a[i])
    {
      cout<<"She passed her exam";
      return 0;
    }
  }
  cout<<"She failed";
}