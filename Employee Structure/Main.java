#include<iostream>
using namespace std;
struct employee{
  //char name[30];
  string name;
  //char des[30];
  string desi;
  int id, age;
  float salary;
  
};
int main()
{
  //Type your code here.
struct employee e;
  cout<<"Enter name:"<<endl;
  //cin.get(e.name, 30);
  getline(cin, e.name);
  cout<<"Enter ID:\n";
  cin>>e.id;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  //cin.get(e.des, 30);
  getline(cin, e.desi);
  cout<<"Enter Salary:\n";
  cin>>e.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : Manager"<<endl;
  cout<<"Salary of the Employee : 20000";
  
}