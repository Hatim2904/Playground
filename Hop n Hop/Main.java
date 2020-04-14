#include<iostream>
#include <cmath>
using namespace std;
int main()
{
  int x, y;
  std::cin>>x;
  std::cin>>y;
  int z=sqrt(((3-x)*(3-x))+((4-y)*(4-y)));
  std::cout<<z;
}