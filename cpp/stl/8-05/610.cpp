//
// Created by a1853 on 25-8-5.
//
#include <iostream>
#include <cstdio>
using namespace std;

int main() {
	string name;
	double money, saleMoney;
	cin >> name >> money >> saleMoney;
	printf("TOTAL = R$ %.2lf",money+(saleMoney*0.15));
	return 0;
}
