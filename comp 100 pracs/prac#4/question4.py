from time import clock
start =clock() 
name = input('enter your name :')
elapsed = clock() -start
print(name, ' it took you', elapsed, 'seconds to enter your name')
''' function clock is imported from time
line 2 gets the starting time 
user enters name
line 4 gets the time time at which the user finish enter
the difference is found from final time minus starting time'''