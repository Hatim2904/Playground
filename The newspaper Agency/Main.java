#include<iostream>
using namespace std;
int main()
{ 
   int w,x,y,profit,cost;
 cin>>w>>x>>y;
 profit=(w*x)-100;
 cost=(w*y);
 cost=profit-cost;
 cout<<cost;
}