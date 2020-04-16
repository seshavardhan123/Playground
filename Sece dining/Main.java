#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int rl;
  cin>>s>>rl;
  if (s=="front")
    if(rl==1)
    cout<<"Left Handed";
    else
    {
        cout<<"Right Handed";

    }
  else
  {
      if (rl == 1)
      cout<<"Right Handed";
      else
      {
          cout<<"Left Handed";
      }
      
  }
  
}