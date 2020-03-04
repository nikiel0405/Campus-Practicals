def toBinary (n):
    b = [] # empty list created
    bine = '' # empty string created
    while n != 0:
        mod = n%2 # modded to get remainder
        n= n//2# updating condition
        b.append(mod)# adding the remainder to empty list
    for i in reversed(b): # reversed to get the number as it is read backwards
        bine = bine + str(i) # added to empty string so we can obtain the final answer
    return bine # returns answer

def toOctal (k): # exactly the same as compared to the binary function explainations
    h=[]
    d = ''
    while k !=0 :
        v =  k%8
        k = k//8
        h.append(v)
    for z in reversed(h):
        d = d + str(z)
    return d

p = int(input('enter a number : '))
if p != 0 :
    print('The binary version of this number is : ', toBinary(p))
    print('The octal version of the number is : ', toOctal(p))
else : # if the integer entered is 0 it will output the final answers as 0 since any number truncated by zero or is zero 
    print('The binary version of this number is : ', 0)
    print('The octal version of the number is : ', 0)    
    
