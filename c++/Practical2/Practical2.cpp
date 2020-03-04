// Prac2.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <cmath>
#include <stack>
#include <string>

using namespace std;
int rotatePoint(double& py, double& px, double alpha);
int longDiv(int dividend, int divisor);
int todec(char c);
int reCalcSpaces(int minuend, int subtrahend, string& spaces);//finds the difference in order of magnitude, between a minuend and subtrahend, given the minuend and SUBTRAHEND. then adds that many spaces to the spaces variable
int Converter(string x);

int main()
{
    int choice = 2;
    do
    {
        cout << "pick a question: 2,3,4" << endl << "give any other input to terminate" << endl;
        cin >> choice;


        //Question 2
        if (choice == 2)
        {
            double px = 0;
            double py = 0;
            double alpha = 0;

            cout << "enter x of point: " << endl;
            cin >> px;
            cout << "enter y of point: ";
            cin >> py;
            cout << "enter angle of rotation: ";
            cin >> alpha;

            rotatePoint(px, py, alpha);
            cout << "new point is " << endl << "X: " << px << ", Y" << py << endl;
        }

        //Question 3
        else if (choice == 3)
        {
            int dividend = 0;
            int divisor = 1;
            cout << "enter dividend" << endl;
            cin >> dividend;
            cout << "enter divisor";
            cin >> divisor;
            if (divisor == 0)
            {
                cout << "cannot divide by zero";
            }
            else
            {
                longDiv(dividend, divisor);
            }
        }

        //Question 4
        else if (choice == 4) {

            string str;
            cout << "Enter a Roman Numerical Number : "  ;
            cin >> str;

            for (auto& i : str)
            {
                i = toupper(i);
            }
            cout << "The decimal equivilant of "<<str <<" is :"<< Converter(str);
        }


        else {
            cout << "SUKA BLEYAT";
            return 0;
        }
        cout << endl;
    } while (choice >= 2 && choice <= 4);

    return 0;
}

//Question 2
int rotatePoint(double& py, double& px, double alpha)
{
    double qx = px * cos(alpha) + py * sin(alpha);
    double qy = -1 * px * sin(alpha) + py * cos(alpha);
    py = qy;
    px = qx;

    return 0;
}
//Question 3
int longDiv(int dividend, int divisor)
{
    //represent the dividend as a stack where the earlier digits are higher up.
    int splittingDividend = dividend;
    stack<int> dividendStack;
    while (splittingDividend > 0)
    {
        dividendStack.push(splittingDividend % 10);
        splittingDividend /= 10;
    }

    //prepare for division
    int subdividend = 0;//the parts of the original dividend carried down to the next level in the working
    int answerElement = 0;//a digit to add onto the answer
    int subtrahend = 0;//what is subtracted at each level from the current subdividend
    int answer = 0;//at the end of the loop this will hold the final answer
    string gradualSpaces = " ";//as we go down levels, the working moves right so we can attach a digit to the end of a difference 
    string immediateSpaces = "";//the space subdividend(minuend) and subtrahend in each level if they are of different orders of magnitude

    //print initial problem
    cout << gradualSpaces << " " << dividend << "/" << divisor << ":" << endl;

    while (!dividendStack.empty())//while there are more digits to bring down
    {
        //bring down a digit, accounting for which column it should be in
        subdividend *= 10;
        subdividend += dividendStack.top();
        dividendStack.pop();
        cout << gradualSpaces << " " << subdividend << endl;

        //calculate the next digit in the answer
        answerElement = subdividend / divisor;

        //calculate the next subtrahend
        subtrahend = answerElement * divisor;

        //incase the subdividend and subtrahend differ in OoM, prepare a string of spaces, with a length of that difference 
        reCalcSpaces(subdividend, subtrahend, immediateSpaces);

        //DEBUGGING
        //cout << "____________________________________________" << subdividend <<immediateSpaces<<subtrahend<< endl;

        //print out subtrahend, formatted and accounting for column
        cout << gradualSpaces << immediateSpaces << "-" << subtrahend << endl;

        //append the most recent answer digit onto the answer
        answer *= 10; answer += answerElement;

        //reset immediateSpaces, since the OoM difference of the next pair of subdividend and subtrahend is not known.
        immediateSpaces = "";

        //determine how far right gradualSpaces needs to move the next step of the process
        reCalcSpaces(subdividend, subdividend - subtrahend, gradualSpaces);

        //find the leftmost digit of the next subdividend. Iin the next iteration, the next digit will be appended, and then only will it be printed
        subdividend = subdividend - subtrahend;
        //print a seperator between levels
        cout << gradualSpaces << "---" << endl;

        //DEBUGGING
        //cout << " " << subdividend << endl;

    }
    //last difference will be omitted due to loop condition. print it, accoutning for column
    cout << gradualSpaces << " " << subdividend << endl;

    cout << "answer = " << answer << endl;

    //the subdividend is the remainder at this point
    cout << "r= " << subdividend << endl;

    //exit
    return 0;
}

int reCalcSpaces(int minuend, int subtrahend, string& spaces)
{
    string sub = to_string(subtrahend);
    string min = to_string(minuend);
    int diff = min.length() - sub.length();

    for (int i = 0; i < diff; i++)
    {
        spaces += " ";
    }
    return 0;
}


//Question 4

int Converter(string x) {
    int total = 0;
    while (x.length() > 0) {

        if ((x.length() == 1) || (todec(x.at(0)) >= todec(x.at(1)))) {

            total += todec(x.at(0));
            x.erase(0, 1);
        }
        else{

            total += (todec(x.at(1)) - todec(x.at(0)));
                x.erase(0, 2);
        }
    }

    return total;
}

int todec(char c) {

    switch (c) {
    case 'I': return 1;

    case 'V': return 5;

    case 'X': return 10;

    case 'L': return 50;

    case 'C': return 100;

    case 'D': return 500;

    case 'M': return 1000;

    default: cout << "Non modo non confodisti confossus Caesar";
        break;
        return -1;
    }
}



//Question 1
/*

        A)  

        this is a pass by reference any changes made in the block of code will also occur outside the function
        void false_swap1(int& a, int& b)
        {
            a = b;      a is being assigned the same value that b currently holds. this overrides the alue originally stored in a. the value in a is now lost
            b = a;      

            one way of fixing this would be to create a temp variable
            }
        int main()
        {
            int x = 3;
            int y = 4;
            false_swap1(x, y);
            cout << x << " " << y << endl;
            return 0;
        }




        B)

        void false_swap2(int a, int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        int main()
        {
            int x = 3;
            int y = 4;
            false_swap2(x, y);
            cout << x << " " << y << endl;
            return 0;
        }


        a and b are not passed by refernce but rather by value
        this means that whatever changes occured to the variable inside the function will not affect the values of them outside 
        way of fixing this would be to pass by reference




*/