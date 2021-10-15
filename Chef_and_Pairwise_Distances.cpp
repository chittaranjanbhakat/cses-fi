#include <bits/stdc++.h>
using namespace std;
#define pi (3.141592653589)
#define mod 1000000007
#define int long long
#define pb push_back
#define mp make_pair
typedef pair<int, int> pii;

signed main()
{
    ios_base::sync_with_stdio(false), cin.tie(NULL);
    int t = 1;
    cin >> t;
    while (t--)
    {
        int n;cin >> n;vector<int> a(n);
        for (int i = 0; i < n; ++i)
            cin >> a[i];
        if (n > 4){
            cout << "NO" << endl;
            continue;
        }
        cout << "YES" << endl;
        for(int i = 0; i < n; ++i){
            if (i % 4 == 0) cout<<a[i]<<" 0"<<endl;
            else if(i % 4 == 1) cout <<"0 "<<a[i]<<endl;
            else if(i % 4 == 2) cout <<-a[i]<< " 0"<<endl;
            else cout <<"0 "<<-a[i] << endl;
        }
    }
    return 0;
}