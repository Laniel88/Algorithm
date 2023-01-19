#include <iostream>
using namespace std;

int main(){
    int stars;
    cin >> stars;
    for(int i = 1; i<=stars ; i++){
        for(int j = 1; j<= stars - i ; j++) cout << " ";
        for(int j = 1; j<= 2 * i - 1 ; j++) cout << "*";
        cout << endl;
    }
    return 0;
}