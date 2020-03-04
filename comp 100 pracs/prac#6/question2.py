def toDecimal (l):
    j = 0
    k = len(l)
    for i in range(len(l)):
        exp = int(l[i])
        powe = k-1
        j = j+exp* 2**powe
        k -=1
    return j

def fromOctToDec(h):
    z = 0
    q = len(h)
    for i in range(len(h)):
        exp1 = int(h[i])
        powe1 = q-1
        z = z+exp1* 8**powe1
        q -=1
    return z

num = int(input('Enter lenght of binary number :'))
lists =[]
for i  in range(num):
    num1 = int(input('Enter 1 or 0: '))
    while num1 !=1 and num1!=0:
        num1 = int(input('Invalid number please Enter 1 or 0 :'))
    lists.append(num1)
print('The decimal conversion of binary number entered is : ',toDecimal(lists))



num3 = int(input('Enter length of octal number:'))
lists2 =[]
for i  in range(num3):
    num4 = int(input('Enter a number between 0 and 7: '))
    while num4 !=1 and num4!=0 and num4!=2 and num4!=3 and num4!= 4 and num4!=5 and num4!=6 and num4!=7:
        num4 = int(input('Invalid number please Enter a number between 0  and 7 :'))
    lists2.append(num4)
print('the decimal conversion of the octal numbered entered is : ',fromOctToDec(lists2))