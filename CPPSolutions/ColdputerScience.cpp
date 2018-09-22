#include <iostream>

using std::cout;
using std::cin;

int main(){
    int a, b, count = 0;
    cin >> a;
    for(size_t i = 0; i < a; ++i){
        cin >> b;
        if(b < 0){
            count++;
        }
    }
    cout << count;
}
