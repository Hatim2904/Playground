#include<iostream>
using namespace std;
int main()
{
  int number,i,b[5];
  std::cin>>number;
 for(i=0;i<4;i++)
{
    int digit = number%10;
   b[i]=digit;
    number /= 10;
}
 std::cout<<b[0]+b[3];
}