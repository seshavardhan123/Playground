#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,cur;
  cin>>birth>>cur;
  if (cur>=birth)
    cout<<cur-birth;
  else
  {
    cur += 100;
    cout<<cur-birth;
  }
}