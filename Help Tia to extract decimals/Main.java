#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
	//Type your code here
  getline(cin, fnum);
  int x =  fnum.find('.');
  string::iterator l = (fnum.end());
  cout<<"Floating part is : ";
  if(x!=string::npos){
  for(int  i =x+1; fnum[i] != *l; i++)
  {
    cout<<fnum[i];
  }
  }
}