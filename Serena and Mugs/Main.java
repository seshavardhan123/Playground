#include<iostream>
#include<bits/stdc++.h>
#include<numeric>
using namespace std;
int printresult(int*, int, int);
int main()
{
  //Type your code here.
  int n, s;
  cin>>n>>s;
  int a[n];
  for(int i = 0; i< n; i++)
  cin>>a[i];
  int x = printresult(a, n, s);
  if (x <= s)
  cout<<"YES";
  else
  {
      cout<<"NO";
  }
  
}

int printresult(int* a, int n, int s)
{
  sort(a,a+n);
  int sum = 0;
  return accumulate(a, a+n, sum);
}