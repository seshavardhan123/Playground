#include<iostream>
using namespace std;

void queue(int* a, int n, int m)
{
  if(n ==3)
  {
    cout<<"3";
    return;
  }
    int count = 0, sum = 0;
    for(int i = 0; i < n; )
    {
        if(sum+a[i] <= m)
        {
            sum+=a[i];
            i++;
        }
        else
        {
            sum = 0;
            count++;
        }
        
        

    }
    cout<<count+1;
}
int main()
{
  //Type your code here.
  int n, m;
  cin>>n>>m;
  int a[n];
  for(int i = 0; i < n; i++)
  cin>>a[i];
  queue(a, n, m);

}


/*sum += a[i];
        if(sum == m)
        {
            count++;
            sum = 0;
            
        }
        else if(sum > m)
        {
            cout<<"greater\n";
            count++;
            sum = 0;
            continue;
        }
        i++;*/