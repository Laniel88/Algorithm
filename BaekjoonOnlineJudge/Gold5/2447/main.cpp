#include <iostream>
using namespace std;

void drawStar(int row, int column, int unit) {
    if((row / unit) % 3 == 1 && (column / unit) % 3 == 1) {
        cout << ' ';
    }
    else {
        if(unit == 1) cout << '*';
        else drawStar(row, column, unit / 3);
    }
}

int main() {
    int N;
    cin >> N;
    for(int row = 0; row < N; row++) {
        for(int column = 0; column < N; column++)
            drawStar(row, column, N / 3);
        cout << endl;
    }
}