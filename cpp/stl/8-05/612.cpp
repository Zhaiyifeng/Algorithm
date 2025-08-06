//
// Created by a1853 on 25-8-5.
//
#include <iostream>
#include <cstdio>

using namespace std;

int main() {
	double R,Y;
	Y = 4/3.0;
	cin >> R;
	R = R*R*R;
	printf("VOLUME = %.3lf",R*Y*3.14159);
	return 0;
}