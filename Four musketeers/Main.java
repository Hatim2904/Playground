#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, e, f;
  std::cin>>a;	//x1
  std::cin>>b;	//y1
  std::cin>>c;	//x2
  std::cin>>d;	//y2
  std::cin>>e;	//x3
  std::cin>>f;	//y3
  float y, z;
  y=(a+c+e)/3.0;
  z=(b+d+f)/3.0;
  std::cout<<y<<"\n";
  std::cout<<z;
}