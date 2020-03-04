#include <iostream>
using namespace std;

typedef unsigned long l;

void Compare(int*& p, double*& q) {
    cout << "p: " << (l)p << endl;
    cout << "p + 1: " << (l )(p + 1) << endl;
    cout << "q: " << (l)q << endl;
    cout << "q+1: " << (l)(q + 1) << endl;
    cout << endl;
    cout << "It is observed that when incremented, the value of the pointer p(int pointer) is lesser than that of the pointer q(double pointer).\nThis is because double values takes more memory than integer values since doubles have both whole and floating point values" << endl;
}



int main()
{
    int* p;
    double* q;
    Compare(p, q);
    return 0;
}

