#include<iostream>
using namespace std;
int main()
{
  //Type your code here..
  string str;
  getline(cin, str);
  for(int i = 0;str[i] != *(str.end()); i++)
      {
    	if(((str[i] >= 65 && str[i] <= 90) ||(str[i] >= 97 && str[i] <= 122)))
        cout<<str[i];
      }
}