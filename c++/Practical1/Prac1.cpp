#include <iostream>
#include <cmath>
using namespace std;

int main() {

	int a = 0;
	int b = 0;
	int c = 0;
	double root1 = 0;
	double root2 = 0;
	cout << "Enter a value " << endl;
	cin >> a;
	cout << "Enter b value " << endl;
	cin >> b;
	cout << "Enter c value " << endl;
	cin >> c;
	double dis = (b * b) - (4 * a * c);
	if (dis < 0) {
		cout << "No Solution "<< endl;
	}
	else {
		root1 = ((-b) + sqrt(dis)) / (2 * a);
		root2 = ((-b) - sqrt(dis)) / (2 * a);
		cout << "1st Root :" << root1 << endl;
		cout << "2nd Root :" << root2 << endl;
	}
	return 0;
}
