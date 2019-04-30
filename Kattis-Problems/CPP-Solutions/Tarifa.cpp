#include <iostream>

using std::cin;
using std::cout;

int main() {
    int a, b, c, sum = 0;
    cin >> a >> b;

    for(int i = 0; i < b; ++i) {
        cin >> c;
        sum += (a-c);
    }

    sum += a;
    cout << sum;
}
