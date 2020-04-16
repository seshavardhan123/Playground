#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here.
  string str1, str2;
  getline(cin, str1);
  getline(cin, str2);
  reverse(str1.begin(), str1.end()) ;
  if(str1== str2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}