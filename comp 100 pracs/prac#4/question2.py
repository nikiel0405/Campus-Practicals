def gcd(a, b, c):
    small = a # sets to  fixed integer
    if b ==0:
        if c<a:
            j=1
            while j <=c:
                if c%j==0 and a%j ==0:
                    return j
#if b is = 0 then the next smallest value is found
# a value that is divisable by both c and a is found and returned
    elif c==0:
        if a< b:
            j=1
            while j <=a:
                if a%j==0 and b%j ==0:
                    return j
                #if c is = 0 then the next smallest value is found
                # a value that is divisable by both b and a is found and returned
    elif a==0:
        if b<c:
            j=1
            while j <=b:
                if b%j==0 and c%j ==0:
                    return j 
                #if a is = 0 then the next smallest value is found
                # a value that is divisable by both c and b is found and returned
            
    if b < a and b < c and b != 0:
        small = b
    elif c < a and c < b and c!=0:
        small = c
    i = 1
    # smallest value from all 3 variables are found
    while i <= small:
        if a%i==0 and b%i==0 and c%i==0:
            g = i
        i += 1
    return g
# gcd is found such than which number can be divisable by all three variables ranging from 1 to the smallest number

num1 = int(input('enter no1 :'))
num2 = int(input('enter no2 : '))
num3 = int(input('enter no3 : '))
print('the gcd of ', num1, num2, num3, 'is', gcd(num1,num2,num3,))

