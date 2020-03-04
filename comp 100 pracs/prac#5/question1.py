import math
def lenghth (x1, x2, y1):
    changex = ((x1-x2)**2)**0.5
    return changex

def lenghty (y1,y2):
    changey = ((y2-y1)**2)**0.5
    return changey

def issquare(lenght1, lenght2):
    if lenght1 == lenght2 :
        return True
    else :
        return False
    
def area(l , width) :
    return (l*width)

def perimeter(l, width):
    return (2*(l+width))

def shaded(cond,changex):
    if cond == True :
        radius= changex /2
        areas = 2*(radius**2)
        circ = math.pi *(radius**2)
        return (circ - areas)        
    else :
        print('figure is not a square')

xt = int(input('TL X: ')) #Top Left x coordinate
yt = int(input('TL Y: ')) #Top -Left y coordinate
xb = int(input('BR X: ')) #Bottom right x coordinate 4
yb = int(input('BR Y: ')) #Bottom right y coordinate
change1 = lenghth(xt, xb,yt)
change2 = lenghty(yt,yb)
peri = perimeter(change1, change2)
are = area(change1, change2)
state = issquare(change1, change2)
p2 = shaded(state, change1)
print('The lenght of the horizontal side : ', change1)
print('the width is :',change2)
print('Is it a square :',state)
print('the area is :',are,'The perimeter is :',peri)
print('the area of the unshade part is :' ,p2)




