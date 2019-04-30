#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::string;

int main(){
    string a, b;
    cin >> a;
    for(size_t i = 0; i < a.length(); ++i){
        if(isupper(a[i])){
            b += a[i];
        }
    }
    cout << b;
}
