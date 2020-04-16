#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string str, rev;
  getline(cin, str);
  int j = 0;
  for(string::reverse_iterator i = str.rbegin(); i < str.rend(); i++)
  {
    rev.push_back(*i);
    //cout<<rev[j];
    j++;
  }
  //rev[j] = '\0';
  //cout<<rev.size();
  cout<<rev;
  
}