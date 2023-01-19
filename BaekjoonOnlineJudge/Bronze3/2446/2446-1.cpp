#include <iostream>
using namespace std;

void printLine(string mark, int cnt, bool lineChange = false){
    for(int j = 0; j < cnt ; j++) cout << mark;
    if(lineChange) cout << endl;
}

int main(){
    int N;
    cin >> N;
    for(int i = N; i > 1; i--){
        printLine(" ",N-i);
        printLine("*",2*i-1, true);
    }
    for(int i = 1; i < N+1; i++){
        printLine(" ",N-i);
        printLine("*",2*i-1, true);
    }
    return 0;
}