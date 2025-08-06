//
// Created by a1853 on 25-7-28.
//
/*
* 读取一个整数值，它是工厂中某个事件的持续时间（以秒为单位），请你将其转换为小时：分钟：秒来表示。

输入格式
输入一个整数 N
。

输出格式
输出转换后的时间表示，格式为 hours:minutes:seconds。

数据范围
1≤N≤1000000

输入样例：
556
输出样例：
0:9:16
 */

#include <iostream>
#include <cstdio>
using namespace std;

int main() {
	int time;
	cin >> time;
	int h, s;
	h = time/3600;
	int m = (time % 3600) / 60;
	s = time %60;
	printf("%d:%d:%d",h,m,s);
}
