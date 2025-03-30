#include <bits/stdc++.h>
using namespace std;
/*
Add Comment Here
*/

string match(string s)
{
    unordered_map<char, int> mp;
    string v ="";
    int ind =0;
    for(int i =0; i<s.size(); i++)
    {
        if(mp.find(s[i]) == mp.end())
        {
            mp[s[i]] = ind++;
            v += to_string(mp[s[i]]);
        }
        else
        {
            v += to_string(mp[s[i]]);
        }

    }
    return v;
}
int main(void)
{

    vector<string> s= {"abcdefghijklab","abcdefghijkabl"}; //
    string pat = "abcdefghijklab";
    string p = match(pat);

    for(auto i: s)
    {
        string res = match(i);
        if(res == p)
            cout<<true<<endl;
    }
    
    
  return 0;
}