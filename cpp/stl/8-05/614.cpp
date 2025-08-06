//
// Created by a1853 on 25-8-5.
//
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    cout << max(a, max(b, c)) << " eh o maior" << endl;
    return 0;
}
