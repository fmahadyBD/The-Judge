
/*
https://codeforces.com/problemset/problem/71/A
Way Too Long Words

Mahady Hasan Fahim
29-11-22
challenge accepted-A1
*/
#include<iostream>
#include<string>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
    string s;
    cin>>s;
    
    if(s.length()>10){
        cout<<s[0]<<s.length()-2<<s[s.length()-1]<<endl;
    }else{

        cout<<s<<endl;


    }


   
    }


    return 0;

}
