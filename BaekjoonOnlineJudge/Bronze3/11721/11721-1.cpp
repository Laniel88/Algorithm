#include <iostream>
using namespace std;

int main(){
    string data;
    cin >> data;

    for(int i=0; i< data.length(); i++){
        cout << data[i];
        if(i % 10 == 9){
            cout << endl;
        }
    }
    return 0;
}