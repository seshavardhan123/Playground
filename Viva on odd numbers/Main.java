#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int count= 0;
    float score = 0.0f ;
  	cout<<fixed<<setprecision(1);
    while(count!=3)
    {
        int a;
        cin>>a;
        if (a<0)
        {
            score-=1;
            break;
        }
        else if ((a%2!=0) )
        {
        score += 1;
          count++;
        }
        else 
        {
            score -= 0.5;
        }
        
        
    }
    cout<<score;
}