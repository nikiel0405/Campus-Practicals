def removevowels(cha):
    alpha = ['AEIOUaeiou']
    z = ''
    for i in range(len(cha)):
        if cha[i] not in alpha :
            z  = z + str(cha[i])
name = input('name :')
print(removevowels(name))