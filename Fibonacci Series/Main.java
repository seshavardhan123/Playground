#include<iostream>

using namespace std;

int fib(int n, int f, int f1, int f2)
{
    if(n==0)
    return f;
    else
    {
        f = f1+f2;
        f1 = f2;
        f2 = f;
        fib(n-1, f, f1, f2);
    }
    
}

int main()
{
    int n;
    cin>>n;
    cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-2, 0, 0, 1);
}