#include <iostream>
using namespace std;

int main(){
    int N, sum = 0;
    string data;
    cin >> N >> data;
    for(int i=0; i<N; i++){
        sum += (int)data[i] - '0';
    }
    cout << sum << endl;
    
    return 0;
}