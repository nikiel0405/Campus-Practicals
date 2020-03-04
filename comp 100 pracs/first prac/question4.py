width = float(input('enter width: '))
breath = float(input('enter breath: '))
cubic = float(input('enter cubic meters per hectors that is yeild: '))
rad = float(input('enter the radi: '))
heigh = float(input('enter the height of storage'))
hect = (width*breath)
yiel = hect*cubic
area = (rad**2)*3.34
vol = area*heigh
filled = hect/vol
unfilled = hect%vol
lenght= unfilled/area 
print(' the number of silos filled are',filled, ' silos.',' the lenght of the unfilled one is', lenght,'m')

