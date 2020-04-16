#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,x2,y2,x3,y3;
  float gx,gy;
  cin>>x1>>y1;
  cin>>x2>>y2;
  cin>>x3>>y3;
  gx = float(x1+x2+x3)/3;
  gy = float(y1+y2+y3)/3;
  if (int(gx) == gx)
    cout<<int(gx);
  else
    cout<<gx;
  cout<<"\n";
  if (int(gy) == gy)
    cout<<int(gy);
  else
    cout<<gy;
  
}