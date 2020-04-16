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
    
    int  val = 0;
    int zig = 0;
    
    
    zig = (accumulate(a[0], a[0]+c, val));
    //cout<<zig<<"\n";
   int  zig1 = (accumulate(a[r-1], a[r-1]+c, val));
    //cout<<zig1<<"\n";
    zig+=zig1;


        
if (r>2 && c>2)
{
    int x = 1, y = c-2;
    for(int i = 1; i <= r-2; i++)
    {
        zig+=a[x][y];
        //cout<<a[x][y]<<" ";
        x++;
        y--;
    }
}   
//cout<<"\n";
cout<<"Sum of Zig-Zag pattern is "<<zig;
   
    
}