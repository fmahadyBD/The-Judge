
/*
https://codeforces.com/problemset/problem/158/A
A. Next Round

Mahady Hasan Fahim
29-11-22
challenge accepted-A1
*/
#include <iostream>
#include <string>
using namespace std;
int main()
{
    int n, k;
    cin >> n;
    cin >> k;
    int c = 0;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i < n; i++)
    {

        if (a[i] >= a[k - 1] && a[i] > 0)
        {
            c++;
        }
    }

    cout<<c << endl;

    return 0;
}
