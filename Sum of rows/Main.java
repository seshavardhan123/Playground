#include<iostream>
#include<bits/stdc++.h>
#include<algorithm>
#include<cstdlib>
using namespace std;




int main()
{
  
    int r, c;
    cin>>r>>c;
    int a[r][c],b[c][r];
    for(int i= 0 ;i < r; i++)
    for(int j = 0; j < c; j++)
    cin>>a[i][j];

    //cout<<"Sum of row elements are:\n";
    //int* sum = (int *)malloc(r*sizeof(int));
    int sum[r];
    int  val = 0;
    int maxi = 0, ind = 0;
    
    for(int i = 0; i < r; i++){
        sum[i] = (accumulate(a[i], a[i]+c, val));
        if(maxi<sum[i])
        {
            maxi = sum[i];
            ind = i;
        }
        cout<<sum[i]<<"\n";

    }
}