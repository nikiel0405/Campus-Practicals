def lenghth (x1, x2):
    changex = ((x1-x2)**2)**0.5
    return changex
def lenghty (y1,y2):
    changey = ((y2-y1)**2)**0.5
    return changey
xt = int(input('TL X: ')) #Top Left x coordinate
yt = int(input('TL Y: ')) #Top -Left y coordinate
xb = int(input('BR X: ')) #Bottom right x coordinate 4
yb = int(input('BR Y: ')) #Bottom right y coordinate
change1 = lenghth(xt, xb)
change2 = lenghty(yt,yb)
print(change1 , change2)