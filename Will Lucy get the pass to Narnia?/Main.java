#include<iostream>
using namespace std;

int main()
{
  int a,b,c,x;
  cin>>a>>b>>c;
  cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(c){
      case 1:
         x = a + b;
         cout <<x;
         break;

      //Subtraction
      case 2:
      	 x = a - b;
         cout <<x;
        break;

      //Multiplication
      case 3:
          x = a * b;
         cout <<x;
         break;

      //Division
      case 4:
          x = a / b;
         cout <<x;
      	break;
      case 5:
          x = a % b;
         cout <<x;
      	break;
       default: cout << "Invalid operation";
  }
}