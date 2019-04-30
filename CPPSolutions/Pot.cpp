#include <iostream>
#include <cmath>

using std::cout;
using std::cin;
using std::endl;

int main(){
    int a, b, sum = 0;
    cin >> a;
    for(int i = 0; i < a; ++i){
        cin >> b;
        sum += pow( (b/10) , (b%10));
    }
    cout << sum;
}
