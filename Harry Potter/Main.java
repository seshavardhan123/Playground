#include<iostream>
//#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string n;
  int r=0;
  getline(cin,n);
  //cout<<"n is "<<n<<"\n";
  int l = (n.size());
  int f= int(n[0])-48;
  //cout<<"f is "<<f<<"\n";
  /*while (n!=0)
  {
    r = n%10;
    cout<<r<<" "; 
    n/=10;
  }

  cout<<"after n is "<<n<<"\n";
  cout<<"r is "<<r<<"\n";*/
  r =int( n[l-1])-48;
  //cout<<" After r is "<<r<<"\n";
  cout<<f+r;
}