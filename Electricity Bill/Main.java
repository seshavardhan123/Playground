#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int cu;
  cin>>cu;
  if (cu<=200)
  {
    cout<<"Rs."<<int(cu*0.5);
    
  }
  else if (cu<=400)
  {
    cout<<"Rs."<<cu*0.65+100;
  }
  else if (cu<=600)
  {
    cout<<"Rs."<<cu*0.80+200;
  }
  else if (cu>=600)
  {
    cout<<"Rs."<<cu*1.25+425;
  }
}