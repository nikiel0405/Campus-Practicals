a = float(input('enter first number: '))
b = float(input('enter second number: '))
c = float(input('enter third number: '))
d = float(input('enter fourth number: '))
high = a
low = a

if (b > high) and (b >c) and (b > d) :
    high  = b
elif (c > high) and (c > b) and (c > d) :
    high = c
elif (d > high) and (d >c) and (d > b) :
    high =  c

if (b < low) and (b  <c) and (b < d):
    low = b
elif (c < low) and (c  < b) and (c < d):
    low = c
elif (d < low) and (d  <c) and (d < b):
    low = d

print('the minimum among', a,',',b,',',c,'and', d,'is',low)
print('the maximum among', a,',',b,',',c,'and', d,'is',high)