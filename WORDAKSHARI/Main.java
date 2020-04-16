#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str1, str2;
  cin>>str1;
  while(str1!="####")
  {
    cin>>str2;
    if(*(str1.end()-1) == *str2.begin())
      cout<<str1<<"\n";
    else
      break;
    str1 = str2;
  }
  cout<<str1;
}