// Practical3Q4.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;
double num[10];
double average(double* a, int a_size); //The prototype of the average function
double* maximum(double* a, int a_size); //The prototype of the maximum function
void printArr();// prints array neatly


int main()
{
    for (int i = 0; i < 10; i++) {
        cout << "Enter a value: " << endl;
        cin >> num[i];
    }
    printArr();

    cout << "Now comes the pointer part: " << endl;
    double* arrptr1;
    arrptr1 = num;
    double* arrptr2;
    arrptr2 = num;
    cout << "The average of all values in the array is: " << average(arrptr1, 10) << endl;
    cout << "The pointer to the maximum value in the array: " << maximum(arrptr2, 10) << ", The value of which is: " << *(maximum(arrptr2, 10)) << endl;
    return 0;
   
}
double average(double* a, int a_size) {

    double sum = 0;
    double avg = 0;

    for (int i = 0; i < a_size; i++) {
        sum += *(a + i);
    }

    return (sum / a_size);

}
double* maximum(double* a, int a_size) {

    double* max = a;
    double temp = 0;

    if (a_size == 0) {
        return NULL;
    }
    else {

        for (int i = 0; i < a_size; i++) {

            temp = *(a + i);
            if (temp > *max) {
                *max = temp;
            }

        }
        return max;
    }


}
void printArr() {
    cout << "[";
    for (int i = 0; i < 10; i++) {
        cout << num[i];
        if (i < 9) {
            cout << ", ";
        }
    }
    cout << "]";
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
