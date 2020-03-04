x = int(input('enter a number to be rooted : '))
if x>0:# checks if the integer is a positive number as negetive numbers are imaginary
    xapp = 0.5*x # initialises control variable
    while ((xapp**2 -x)**2) > ((10**-9)**2):# executes given action that it should not differ by 10 to the -9 digits
        xap = 0.5*((x/xapp)+xapp)#executes the formulae given
        xapp = xap# updates control variable
    print('the best apprx is: ',xapp)
else :
    print('the value you have entered is incorrect please enter a valid positive number')
