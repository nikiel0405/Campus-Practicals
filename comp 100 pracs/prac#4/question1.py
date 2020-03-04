def leap(year):
    if (year%4==0) or (year%400==0 and year%100==0):#given the condition this line checks if the year is divisable by 4 or is divisable by both 100 and 400
        return True # returns true if satasfies the statement
    else :
        return False # returns false if does not satisfies statement
y = int(input('enter a desired year : '))# user asked to enter a year
if leap(y) == True: # condition is checked
    print(y , 'It is leap')
else :
    print(y,'It is not leap')