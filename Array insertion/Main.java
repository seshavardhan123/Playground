#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int arr[n+1];
  for(int i = 0; i < n; i++)
  cin>>arr[i];
  int pos, val_insert;
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  if(pos>n)
  {
  cout<<"Invalid Input";
   return 0;
  } 
  
  pos-=1;
  cout<<"Enter the value to insert\n";
  cin>>val_insert;
  cout<<"Array after insertion is\n";
  for(int  i = n; i>=pos; i--)
  arr[i] = arr[i-1];
  arr[pos] = val_insert;
  for(int i = 0; i < n+1; i++)
  cout<<arr[i]<<"\n";
}