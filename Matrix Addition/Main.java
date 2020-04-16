#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n>>n;
  int a[n][n], b[n][n];
  for(int i = 0; i < n; i++)
    for(int j = 0; j < n ; j++)
      cin>>a[i][j];
  for(int i = 0; i < n; i++)
    for(int j = 0; j < n ; j++)
      cin>>b[i][j];
  for(int i = 0; i < n; i++){
    for(int j = 0; j < n ; j++){
      cout<<a[i][j]+b[i][j]<<" ";
    }
    cout<<"\n";
  }
  
  
}