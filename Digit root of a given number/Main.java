#include<iostream>

using namespace std;

int sum_dig(int n)
{
    static int sum = 0;
    //cout<<"n is "<<n<<"\n";
    //cout<<"sum is "<<sum<<"\n";
    if(n==0)
    {
        //cout<<"inside n==0"<<"\n";
        if(sum <= 9)
        {
            //cout<<"inside sum<=9 "<<"\n";
            return sum;
        }
        
        //cout<<sum<<"\n";
        n = sum;
        sum = 0;
        return sum_dig(n);

    }
    sum += n%10;
    n /= 10;
    
    sum_dig(n);
}

int main()
{
    int n;
    cin>>n;
    cout<<sum_dig(n);
}