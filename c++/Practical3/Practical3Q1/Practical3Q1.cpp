// Practical3.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;

typedef unsigned short int c;

c sum;

bool IsLeap(c x);
int NoOfDays(c mon, c yea);


struct Date
{
    c day;
    c month;
    c year;

};
bool IsLeap(c x) {

    if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)   //if year is a leap year
        return true;

    else
        return false;

}


int NoOfDays(c mon, c yea) {

    if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)
        return 31;

    // april, jun, sept, nov contains 30 days
    if (mon == 4 || mon == 6 || mon == 9 || mon == 11)
        return 30;

    if (mon == 2)
    {
        if (IsLeap(yea)) { // if year is a leap year then Feb will contain 29 days, otherwise it contains 28 days
            return 29;
        }
        else {
            return 28;
        }
    }

}




int FindDiff(c& y1, c& m1, c& d1, c& y2, c& m2, c& d2) {
    sum = 0;

    if (y1 == y2) {

        if (m1 == m2) {

            if (d1 == d2) {
                return 0; // days are the same difference is 0
            }
            else {
                return abs(d1 - d2);// difference will be 1 day subtracted by the other
            }
        }// ends to check months are equal
        else if (m1 < m2) {
            for (int i = m1; i < m2; i++) {
                sum += NoOfDays(i, y1);
            }

            if (d1 == d2) {
                return sum;
            }// days are the same returns difference in months
            else if (d1 < d2) {
                return sum + (d2 - d1); // adds difference to sum
            }
            else {
                return sum - (d1 - d2);
            }// subtracts the overlapping days
        }// if one month is less than the other

        else {
            for (int i = m2; i < m1; i++)
                sum += NoOfDays(i, y1);

            if (d1 == d2) {
                return sum;
            }
            else if (d2 < d1)
            {
                return sum + (d2 - d1);
            }
            else
            {

                return sum - (d2 - d1);
            }
        }// same as the methods for 
    }// ends to check years are equal

    else if (y1 < y2)
    {
        int temp = 0;
        for (int i = y1; i < y2; i++)
        {
            if (IsLeap(i))
                temp = temp + 366;
            else
                temp = temp + 365;
        }

        if (m1 == m2)
        {
            if (d1 == d2)      //for same month, same day but diff year
                return temp;
            else if (d1 < d2)
                return temp + (d2 - d1);
            else
                return temp - (d1 - d2);
        }
        else if (m1 < m2)
        {

            for (int i = m1; i < m2; i++)
                sum += NoOfDays(i, y2);

            if (d1 == d2)      // for same day, diff year and diff month
                return temp + sum;
            else if (d1 < d2)
            {
                sum += (d2 - d1);
                return temp + sum;
            }
            else
            {
                sum -= (d1 - d2);
                return temp + sum;
            }
        }
        else
        {
            int result = 0;
            for (int i = m2; i < m1; i++)
                sum += +NoOfDays(i, y2);

            if (d1 == d2)
                return temp - sum;
            else if (d2 < d1)
            {
                sum += (d1 - d2);
                return temp - sum;
            }
            else
            {
                sum -= (d2 - d1);
                return temp - sum;
            }
        }
    }
    else
    {
        int temp = 0;
        for (int i = y2; i < y1; i++)
        {
            if (IsLeap(i))
                temp = temp + 366;
            else
                temp = temp + 365;
        }

        if (m1 == m2)
        {
            if (d1 == d2)      // for same day, same month but diff year
                return temp;
            else if (d2 < d1)
                return temp + (d1 - d2);
            else
                return temp - (d2 - d1);
        }
        else if (m2 < m1)
        {
            // int result = 0;
            for (int i = m2; i < m1; i++)
                sum += NoOfDays(i, y1);

            if (d1 == d2)
                return temp + sum;
            else if (d2 < d1)
            {
                sum += (d1 - d2);
                return temp + sum;
            }
            else
            {
                sum -= (d2 - d1);
                return temp + sum;
            }
        }
        else
        {
            int sum = 0;
            for (int i = m1; i < m2; i++)
                sum = sum + NoOfDays(i, y1);

            if (d1 == d2)      // for same day, diff year and diff month
                return temp - sum;
            else if (d1 < d2)
            {
                sum += (d2 - d1);
                return temp - sum;
            }
            else
            {
                sum -= (d1 - d2);
                return temp - sum;
            }
        }
    }

}




int main()
{
    Date p1, p2;

    cout << "Following will find difference in two dates" << endl;
    cout << "Enter year : ";
    cin >> p1.year;
    cout << "Enter month : ";
    cin >> p1.month;
    cout << "Enter day : ";
    cin >> p1.day;

    cout << "Now enter the second year values" << endl;

    cout << "Enter year : ";
    cin >> p2.year;
    cout << "Enter month : ";
    cin >> p2.month;
    cout << "Enter day : ";
    cin >> p2.day;

    cout << "The difference in days are : ";
    cout << FindDiff(p1.year, p1.month, p1.day, p2.year, p2.month, p2.day);

    return 0;
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