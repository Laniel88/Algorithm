#include <iostream>
using namespace std;

int main() {
    int stars;
    cin >> stars;
    for(int i = 1; i<=stars ; i++){
        for(int j = 1; j<= i ; j++) cout << "*";
        cout << endl;
    }
    return 0;
}