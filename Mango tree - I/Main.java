#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,tree;
  cin>>r>>c>>tree;
  if (tree<=c)
  cout<<"Yes";
  else if (tree%c==1 || tree%c == 0)
    cout<<"Yes";
  else
    cout<<"No";
}