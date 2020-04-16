#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil;
  int lit, dis;
  cin>>mil>>lit>>dis;
  if (mil*lit>= dis)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}