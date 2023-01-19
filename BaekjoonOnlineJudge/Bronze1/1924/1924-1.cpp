#include <iostream>
using namespace std;

int main(){
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int month, date, cnt = 0;
    string dow[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    cin >> month >> date;

    for(int i = 0 ; i <month -1 ; i++){
        cnt += days[i];
    }
    cnt += date;
    cout << dow[cnt % 7] << endl;
}