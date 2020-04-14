#include<iostream>
using namespace std;
int main()
{
  int a, b, c;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  float w, x, y, z;
  w=(a*b*c)/100;
  x=a+w;
  y=w*0.02;
  z=x-y;
  std::cout<<w<<"\n";
  std::cout<<x<<"\n";
  std::cout<<y<<"\n";
  std::cout<<z<<"\n";
}