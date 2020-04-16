#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str[100], rev[100];
    cin.getline(str, 100);
    int  l = strlen(str), i = l;
    while(str[i-1] != '\0')
    {
        rev[l - i] = str[i-1];
        i--;
    }
    rev[l-i] = '\0';
    cout<<rev;
}