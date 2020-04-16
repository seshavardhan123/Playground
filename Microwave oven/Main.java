#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float heat_time;
  cin>>n>>heat_time;
  cout<<fixed<<setprecision(2);
  if (n==2)
  {
  	heat_time+= heat_time*0.5;
  }
  else if (n==3)
    heat_time = heat_time*2;
  else if (n>3)
  {
    cout<<"Number of items is more";
    return 0;
  }
  cout<<heat_time;
}