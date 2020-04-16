#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fl_pr, fl_dis, fl_sh;
  int sn_pr, sn_dis, sn_sh;
  int am_pr, am_dis, am_sh;
  cin >> fl_pr>>fl_dis>>fl_sh;
  cin >> sn_pr>> sn_dis>> sn_sh;
  cin >> am_pr>> am_dis>> am_sh;
  
  fl_pr = (fl_pr-(fl_pr*(fl_dis*0.01))) +fl_sh;
  sn_pr =(sn_pr -(sn_pr*(sn_dis*0.01))) + sn_sh;
  am_pr = (am_pr-(am_pr*(am_dis*0.01))) + am_sh;
  cout<<"In Flipkart Rs."<<fl_pr<<"\n";
  cout<<"In Snapdeal Rs."<<sn_pr<<"\n";
  cout<<"In Amazon Rs."<<am_pr<<"\n";
  if (fl_pr<=sn_pr)
  {
    if (fl_pr<=am_pr)
      cout<<"He will prefer Flipkart";
    else
      cout<<"He will prefer Amazon";
    
  }
  else if (sn_pr<=am_pr)
  {
    cout<<"He will prefer Snapdeal";
  }
  else
    cout<<"He will prefer Amazon";
}