#include <iostream>
using namespace std;

void printLine(string mark, int cnt, bool lineChange = false){
    for(int j = 0; j < cnt ; j++) cout << mark;
    if(lineChange) cout << endl;
}

int main(){
    int N;
    cin >> N;
    for(int i = 1; i < N ; i++){
        printLine("*", i);
        printLine(" ", 2*N - 2*i);
        printLine("*", i,true);
    }
    for(int i = N; i > 0 ; i--){
        printLine("*", i);
        printLine(" ", 2*N - 2*i);
        printLine("*", i,true);
    }
    return 0;
}