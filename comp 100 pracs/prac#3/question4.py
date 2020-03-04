y = int(input('enter num :'))
fibronacci = [1,2] # array is created
'''i = 2
while i <= y:
    fibronacci.append(fibronacci[i-2]+fibronacci[i-1])# calculates the sum of previous terms
    i+=1 #increments control variable
answer = 0 #initialises variable
while answer <= y-1:
    print('fibronacci number :', fibronacci[answer])
    answer+=1#increment control variable'''
for j in range(2, y, 1):
    fibronacci.append(fibronacci[j-2]+fibronacci[j-1])
print(fibronacci)
    