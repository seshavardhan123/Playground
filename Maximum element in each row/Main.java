#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here.
  int r, c;
    cin>>r>>c;
    int a[r][c];
    for(int i= 0 ;i < r; i++)
    for(int j = 0; j < c; j++)
    cin>>a[i][j];
    
    
    
    
    for(int i= 0 ;i < r; i++){
        int *maxi;
    //for(int j = 0; j < r; j++){
        //b[j][i] = a[i][j];
        maxi = (int *)max_element(a[i], a[i]+c);

        cout<<*maxi<<" ";
    //}
    cout<<"\n";
    }

    

}   