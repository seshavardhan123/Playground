#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i = 0; i < n; i++)
  {
    cin>>a[i];
  }
  cout<<*max_element(a, a+n);
}