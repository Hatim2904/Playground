#include<iostream>
int main()
{
  int b,a;
  std::cin>>b>>a;
  if(b>a){
    std::cout<<"Yes, you can enter.";}
  else if(b==a){
    std::cout<<"Yes, you can enter. Kindly use a rope.";}
  else
    std::cout<<"Sorry, you can't enter";
}