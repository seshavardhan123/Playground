#include<iostream>
//#include <cmath>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  float total_balls, to_runs, run_sc;
  int balls;
  cin>>total_balls>>to_runs>>run_sc>>balls;
  cout<<fixed;
  cout<<setprecision(1);
  //cout<<total_balls/6<<"\n"<<balls/6<<"\n"<<run_sc/balls<<"\n"<<to_runs/total_balls;
  int over_tot = total_balls/6;
  cout<<over_tot<<"\n";
  float over_fi = (balls/6)+((balls%6)*0.1);
  cout<<over_fi<<"\n";
  float cur_run = (run_sc/over_fi);
  cout<<cur_run<<"\n";
  float tot_run = (to_runs/over_tot);
  cout<<tot_run<<"\n";
  if ((cur_run)>=(tot_run))
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}