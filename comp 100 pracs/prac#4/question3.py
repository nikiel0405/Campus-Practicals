def lcm(a, b, c):
    high = a
    if b > a and b > c and b != 0:
        high = b
    elif c > a and c > b and c!=0:
        high = c 
        # highest number is found
    while True:
        if a==0 or b==0 or c==0:
            l=0# if any value is = 0 therefore the lowest common multiple is 0
            break# restrits the formation of infinite loop 
        if high%a==0 and high%b==0 and high %c==0:
            l=high# a number is found such that it is divisable by all numbers
            break# restrits the formation of infinite loop
        high +=1#control variable is incremented   
    return l# returns value found 
num1 = int(input('enter no1 :'))
num2 = int(input('enter no2 : '))
num3 = int(input('enter no3 : '))
print(' The lcm of', num1, num2, num3, 'is',lcm(num1,num2, num3))