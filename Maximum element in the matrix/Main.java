#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here.
  int r, c;
    cin>>r>>c;
    int a[r][c],b[c][r];
    for(int i= 0 ;i < r; i++)
    for(int j = 0; j < c; j++)
    cin>>a[i][j];
    int x =0;
    for(int i= 0 ;i < r; i++){
        int *maxi;
        maxi = max_element(a[i], a[i]+c);
        if(x<*maxi)
        x = *maxi;

    }
    cout<<"The maximum element is "<<x;

}