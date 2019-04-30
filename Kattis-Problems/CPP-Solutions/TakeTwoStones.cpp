#include <iostream>

int main()
{
  int num;
  std::cin >> num;
  
  if(num % 2 == 0){
      std::cout << "Bob" << std::endl;
  } else {
      std::cout << "Alice" << std::endl;
  }
}
