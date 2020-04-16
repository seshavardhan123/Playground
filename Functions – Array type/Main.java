#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, flag = 0,eve= 0,odd=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  //cin>>x;
  
  for(int i = 0; i< n; i++)
  {
    int x;
    cin>>x;
    if(x%2 ==0)
      eve++;
    else
      odd++;
      
  }
  if(eve == n)
    cout<< "The array is Even";
  else if(odd == n)
    cout<< "The array is Odd";
  else
    cout<<"The array is Mixed";
}