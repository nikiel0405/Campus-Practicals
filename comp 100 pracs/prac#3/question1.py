x = int(input('enter first number :'))
y = int(input('enter second number :'))
z = int(input('enter third number :'))
high = x#sets variable to highest
if y >high: 
    y = high
elif z >high:
    z = high
i = 1 # sets control variable to a value before starting while loop
while i<=high:# while loop calculates gcd
    if (x%i==0) and (y%i==0) and (z%i==0):
        gcd = i;
    i+=1#control variable is updated to stop the possibility of an infinate loop
print('the greatest common divisor of', x,',',y,',',z,'is = ',gcd)
'''from line 5 to 8 
the highest possible value is calculated so it can be used as a barrier
such that the while loop can have  control variable'''