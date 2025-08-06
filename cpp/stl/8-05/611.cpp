//
// Created by a1853 on 25-8-5.
//
#include <iostream>
#include <cstdio>
using namespace std;

int main() {
	double a,b;
	int c,d,e,f;
	cin>>c>>d>>a;
	cin>>e>>f>>b;

	a = d*a;
	b = b*f;
	printf("VALOR A PAGAR: R$ %.2lf",a+b);
}