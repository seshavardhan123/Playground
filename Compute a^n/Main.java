#include<iostream>

using namespace std;


int power(int bas, int exp)
{
    static int i = 1, mul = 1;
    
    if(exp == i-1)
    return mul;
    else{
        mul *= bas;
        //cout<<i<<"\n";
        //cout<<"sfa";
        i++;
        return power(bas, exp);
        
        //cout<<"hi";
    }
}

int main()
{
    int base, exp;
    cout<<"Enter the value of a\n";
    cin>>base;
    cout<<"Enter the value of n\n";
    cin>>exp;

    cout<<"The value of "<<base<<" power "<<exp<<" is "<<power(base, exp);

}

