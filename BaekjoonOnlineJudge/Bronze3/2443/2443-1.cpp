#include <iostream>
using namespace std;

int main(){
    int stars;
    cin >> stars;
    for(int i = stars ; i > 0 ; i--){
        for(int j = 1; j<= stars-i ; j++) cout << " ";
        for(int j = 1; j<= i*2-1 ; j++) cout << "*";
        cout << endl;
    }
    return 0;
}