//
// Created by a1853 on 25-7-28.
//
/*
* 在这个问题中，你需要读取一个整数值并将其分解为多张钞票的和，每种面值的钞票可以使用多张，并要求所用的钞票数量尽可能少。

请你输出读取值和钞票清单。

钞票的可能面值有 100,50,20,10,5,2,1
。

经过实验证明：在本题中，优先使用面额大的钞票可以保证所用的钞票总数量最少。

输入格式
输入一个整数 N
。

输出格式
参照输出样例，输出读取数值以及每种面值的钞票的需求数量。

数据范围
0<N<1000000

输入样例：
576
输出样例：
576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00
 */

#include <iostream>
#include <cstdio>
using namespace std;

int main(){
     int n;
	 int num[7];
	 num[0] = 100;
	 num[1] = 50;
	 num[2] = 20;
	 num[3] = 10;
	 num[4] = 5;
	 num[5] = 2;
	 num[6] = 1;
	 cin >> n;
	printf("%d",n);
     for (int num1: num) {
     	printf("%d nota(s) de R$ %d,00\n",n/num1,num1);
     	n = n % num1;
     }
	//定义一个数组
	return 0;
}