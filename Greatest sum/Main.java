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

    cout<<"Sum of rows is ";
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
        cout<<sum[i]<<" ";

    }
	cout<<"\n";

    
    //sum = sum_of_row_col(a);
    cout<<"Row "<<ind+1<<" has maximum sum\n";
    //cout<<*(max_element(sum, sum+r));
    //sum = NULL;

    for(int i= 0 ;i < r; i++)
    for(int j = 0; j < c; j++)
        b[j][i] = a[i][j];
    
    /*for(int i= 0 ;i < c; i++){
    for(int j = 0; j < r; j++)
       cout<<b[i][j]<<" ";
       cout<<"\n";
    }*/

    cout<<"Sum of columns is ";
    int sum_ptr[c];

    //sum_ptr = (int *)realloc(sum, c*sizeof(int));
    val = 0;
    maxi = 0, ind = 0;
    
    for(int i = 0; i < c; i++){
        sum_ptr[i] = (accumulate(b[i], b[i]+r, val));
        if(maxi<sum_ptr[i])
        {
            maxi = sum_ptr[i];
            ind = i;
        }
        cout<<sum_ptr[i]<<" ";
    }  
  
    cout<<"\nColumn "<<ind+1<<" has maximum sum";
    //int maxi = *(max_element(sum_ptr, sum_ptr+c));


}   