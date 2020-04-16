#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n, eve = 0, odd = 0 ; 
  cin >>n;
  for(int i = 0; i < n; i++)
  {
    int x;
    cin>>x;
    if(x%2 == 0)
      eve++;
    else
      odd++;
  }
  cout<<odd<<"\n"<<eve;
  return 0;
}