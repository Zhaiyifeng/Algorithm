#include <iostream>
#include <string>
using namespace std;

int main() {
    // 基本数据类型
    int age = 25;
    double height = 175.5;
    char grade = 'A';
    bool isStudent = true;
    string name = "张三";
    
    cout << "姓名: " << name << endl;
    cout << "年龄: " << age << endl;
    cout << "身高: " << height << "cm" << endl;
    cout << "成绩: " << grade << endl;
    cout << "是否为学生: " << (isStudent ? "是" : "否") << endl;
    
    return 0;
}