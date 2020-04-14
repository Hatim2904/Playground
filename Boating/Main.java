#include<iostream>
using namespace std;
int main()
{
  int a,b,c,w;
  std::cin>>a>>b>>c;
  w=(b*75)+(c*30);
  if(w<a){
  std::cout<<"Boat is stable";}
  else{std::cout<<"Boat will drow";}
}