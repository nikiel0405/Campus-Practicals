def quad(a, b,c):
    if a==0 :
        return 'not a quadratic formulae'# checks if it is a quadratic equation
    fi = (b*b)-(4*(a*c))# finds the discriminant
    if fi< 0:
        return '-1'# if discriminant is less than 0. vale -1 is sent to indicate formulae has no real roots
    else:
        value = (-1*(b)+(fi**0.5))/(2*(a)) # the positive/ addition equation is used to find the possible roots
        return value
num1 = eval(input('enter first value i.e a : '))
num2 = eval(input('enter second value i.e b: '))
num3 = eval(input('enter third value i.e c : '))
num = quad(num1, num2, num3)
stri = str(num1)+'x**2'+'+'+str(num2)+'x'+'+'+str(num3)# addition of strings so  no spaces are in the formulae i.e it does not look like a x**2 + b x + c = value
print(num ,'=' , stri)