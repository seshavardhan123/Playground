#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r, c;
  cin>>r>>c;
  int a[r][c], b[r][c], res[r][c];
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++)
            std::cin>>a[i][j];
        }
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++)
            cin>>b[i][j];
        }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            res[i][j] = a[i][j] + b[i][j];
          cout<<res[i][j] <<" ";
        }
    cout<<"\n";
  }
}