#include<iostream>
#include<math.h>
using namespace std;

int main()
{
  int m, n, req;
  cin>>m>>n>>req;
  if(req <= (pow(m,n)))
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
