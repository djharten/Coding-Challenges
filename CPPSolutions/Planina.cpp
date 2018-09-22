#include <iostream>
#include <cmath>

using std::cout;
using std::cin;

int main() {
    int a;
    cin >> a;
    int ans = (int) pow(pow(2,a) + 1, 2 );
    cout << ans;
}
