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
    for(int i= 0 ;i < r; i++){
    for(int j = 0; j < c; j++){
        b[j][i] = a[i][j];
        //cout<<b[j][i]<<" ";
    }
    //cout<<"\n";
    }
    for(int i= 0 ;i < c; i++){
        int *maxi;
    //for(int j = 0; j < r; j++){
        //b[j][i] = a[i][j];
        maxi = (int *)max_element(b[i], b[i]+r);

        cout<<*maxi<<" ";
    //}
    cout<<"\n";
    }

    

}   