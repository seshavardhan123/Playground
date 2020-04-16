#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int sum = 0, num = n; 
  string s;
  stringstream ss;
  ss<<n;
  s = ss.str();
  int len = s.size();

  
  while(n!=0)
  {
    sum += power(n%10,len);
    n/= 10;
  }
  //std::cout<<"sum is "<<sum;
  if (sum == num)
    return 1;
  return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}