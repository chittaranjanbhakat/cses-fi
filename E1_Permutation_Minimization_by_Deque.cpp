#include<bits/stdc++.h>
using namespace std;

int main()
{
 int t;
 cin>>t;
 while(t--)
 {
  int n;
  cin>>n;
  vector<int> v(n);
  for(int i=0;i<n;i++)cin>>v[i];
   
  deque<int> dq;
        dq.push_back(v[0]);
        for(int i=1;i<n;i++){
         int front=dq.front();
            if(v[i]<=front){
                dq.push_front(v[i]);
            }
            else {
             dq.push_back(v[i]);
            }
        }
        while(dq.empty()==false)
        {
         int front=dq.front();
         dq.pop_front();
         
            cout<<front<<" ";
        }
        cout<<endl;
 }
}