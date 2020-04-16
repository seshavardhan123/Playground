#include <iostream>
#include<bits/stdc++.h>
#include<string>
#include<cstdlib>
using namespace std;
int main() 
{
	// Type your code here
    string s;
    int n;
    cin >> n;
//  s = string(n);
    stringstream ss;
    ss<<n;
    ss>>s;
    //s = to_string(n);
    reverse(s.begin(), s.end());
    //ss<<s;
    //ss>>n;
    //cout<<"string is "<<s<<"\n";
    n = atoi(s.c_str());
    cout<<n;
	return 0;
}