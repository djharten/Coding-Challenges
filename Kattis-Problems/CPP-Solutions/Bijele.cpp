#include <iostream>
#include <array>

using std::cout;
using std::cin;
using std::array;

int main(){
    array<int, 6> arr = {1, 1, 2, 2, 2, 8};
    for(size_t i = 0; i < arr.size(); ++i){
        int a;
        cin >> a;
        cout << arr[i] - a << " ";
    }
}
