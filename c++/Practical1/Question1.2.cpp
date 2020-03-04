#include <iostream>
using namespace std;

int main() {
    //Question A
    int num1 = 0, num2 = 0;
    cout << "Enter the first number: " << endl;
    cin >> num1;
    cout << "Enter the second number: " << endl;
    cin >> num2;
    int min = num1;
    if (min > num2) {
        min = num2;
    }
    cout << "QuestionA - Minimum:\nThe minimum value is: " << min << "\n" <<endl;

    //Question B
    for(int i = min; i > 0; i--) {
        if ((num1 % i == 0) && (num2 % i == 0)) {
            cout << "QuestionB - HCF:\nThe HCF is: " << i << "\n"<<endl;
            break;
        }
    }
    if (num1 % min != 0) {
        cout << "There is no HCF between the two numbers!" << endl;
    }

    //Question C
    int max = num1;
    if (min == num1) {
        max = num2;
    }
    for(int j = max; j > 0; j++) {
        if ((j % num1 == 0) && (j % num2 == 0)) {
            cout << "QuestionC - LCM:\nThe LCM is: " << j << "\n"<<endl;
            break;
        }
    }

    //Question D
    int prev = 0, next = 1, nth = 0, element = 0, temp = 0;
    cout << "Enter the position n: " << endl;
    cin >> nth;
    for (int i = 0; i < nth - 1; i++) {
        temp = next;
        next = next + prev;
        prev = temp;
    }
    element = next;
    cout << "QuestionD - Fibonacci:\nThe " << nth << "th element is: " << element << "\n"<<endl;

    //Question E
    cout << "QuestionE.1 - Diamond: \n";
    int diameter = 0, topstar = 1, bspace = 1;
    cout << "Enter the diameter: " << endl;
    cin >> diameter;
    int bstar = diameter - 2;
    int tspace = (diameter-1)/2;
    for(int k = 0; k < diameter; k++) {
        if (k < ((diameter-1)/2)+1) {
            for(int m = 0; m < tspace; m++) {
                cout << " ";
            }
            for(int n = 0; n < topstar; n++) {
                cout << "*";
            }
            tspace--;
            topstar += 2;
            cout << endl;
        }
        else {
            for(int a = 0; a < bspace; a++) {
                cout << " ";
            }
            for(int b = 0; b < bstar; b++) {
                cout << "*";
            }
            bspace++;
            bstar -= 2;
            cout << endl;
        }
    }
    cout << "the zig-zag shape:" << endl;
    cout << endl;
    string stars = "* * *";
    int spaceCountZ = 5, q, w;
    bool dec = true;

    for(q = 1; q <= 16; q++){

         for(w =0; w <= spaceCountZ; w++){
             cout << " ";
         }
        cout<< stars << endl;

        if(dec){
            spaceCountZ--;
        }else{
            spaceCountZ++;
        }

        if(q % 5 == 0){
            dec = !dec;
        }
   }
   //end
   return 0;
}
