#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    string name;
    int age;
    double score;

public:
    // 构造函数
    Student(string n, int a, double s) : name(n), age(a), score(s) {}
    
    // 成员函数
    void displayInfo() {
        cout << "姓名: " << name << ", 年龄: " << age << ", 成绩: " << score << endl;
    }
    
    // getter 和 setter
    string getName() { return name; }
    void setScore(double s) { score = s; }
    double getScore() { return score; }
};

int main() {
    Student student1("李四", 20, 88.5);
    student1.displayInfo();
    
    student1.setScore(92.0);
    cout << "更新后的成绩: " << student1.getScore() << endl;
    
    return 0;
}