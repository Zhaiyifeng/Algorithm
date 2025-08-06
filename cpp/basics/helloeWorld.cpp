#include <iostream>
#include <windows.h>
#include <cstdio>
using namespace std;
int main() {
    SetConsoleOutputCP(CP_UTF8);
    int a = 1;
    int b = 2;
    int c = a + b;
    float d = 3.14;
    double e = 3.14;
    bool f = false;
    cout << "Hello World" <<endl;

    cin >> a;
    cin >> b;
    cout  << "预期值为:";
    cout<< a+b;
    cout<< endl;
    scanf("%d%d",&a,&b);
    printf("预期值为:%d",a+b);
    return 0;

}