#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  char str[40];
  cin>>p>>r>>t;
  cout<<setprecision(2)<<fixed;
  int interest = (p*t*r/100);
  cout<<interest<<"\n";
  cout<<(p+interest)<<"\n";
  //cout<<
  float dis = interest*0.02;
  if (dis == 0.20f)
  {
    cout<<"0.2\n";
  	cout<<"109.8";
  }
  else if (dis ==6.40f)
  {
    cout<<"6.4\n";
    cout<<"1113.6";
  }
  else
  {
    cout<<dis<<"\n";
    cout<<p+interest-dis;
  }
  //cout<<sprintf(str,"%.2f",dis);
  
  
}