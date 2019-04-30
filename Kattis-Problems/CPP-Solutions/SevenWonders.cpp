#include <iostream>
#include <cmath>
#include <string>

using std::cin;
using std::cout;
using std::string;

int main() {
    string a;
    int c = 0, g = 0, t = 0;
    cin >> a;
    for(size_t i = 0; i < a.length(); ++i) {
        char letter = a[i];
        if(letter == 'C') {
            c++;
        } else if(letter == 'G') {
            g++;
        } else {
            t++;
        }
    }

    int sum = pow(c,2) + pow(g,2) + pow(t,2);
    while(c > 0 && g > 0 && t > 0) {
        sum += 7;
        c--;
        g--;
        t--;
    }
    cout << sum;
}
