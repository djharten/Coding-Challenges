#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::endl;
using std::string;
using std::getline;

int main(){
    string a, b = "ss";
    getline(cin, a);
    if(a.find(b) != string::npos){
        cout << "hiss" << endl;
    } else {
        cout << "no hiss" << endl;
    }
}
