#include <iostream>
using namespace std;

int main() {
    // if-else 语句
    int score = 85;
    if (score >= 90) {
        cout << "优秀" << endl;
    } else if (score >= 80) {
        cout << "良好" << endl;
    } else if (score >= 60) {
        cout << "及格" << endl;
    } else {
        cout << "不及格" << endl;
    }
    
    // for 循环
    cout << "1到10的数字: ";
    for (int i = 1; i <= 10; i++) {
        cout << i << " ";
    }
    cout << endl;
    
    // while 循环
    int count = 0;
    cout << "倒计时: ";
    while (count < 5) {
        cout << (5 - count) << " ";
        count++;
    }
    cout << "完成!" << endl;
    
    return 0;
}