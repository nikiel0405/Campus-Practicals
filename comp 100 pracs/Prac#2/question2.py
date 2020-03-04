radius = eval(input('enter the radius of the circle: '))
cx = eval(input('enter the x co-ordinate of the circle: '))
cy = eval(input('enter the y co-ordinate of the circle: '))
x = eval(input('enter the x co-ordinate: '))
y = eval(input('enter the y co-ordinate: '))
distance = 0.5*(((cx-x)**2) +((cy-y)**2))
if  distance < radius:
    print('point lies within the circle')
    areacir = (22/7)*(radius**2)
    arearec = (2*radius)*(2*radius)
    diff = arearec - areacir
    print('the difference in area between the circle and rectangle is', diff,'units cubed')
elif distance >radius :
    print('point does not lie in the circle')
elif (distance == radius):
    print('point lies on the circumference the circle')
    areacir = (22/7)*(radius**2)
    arearec = (2*radius)*(2*radius)
    diff = arearec - areacir
    print('the difference in area between the circle and rectangle is', diff ,'units cubed')    
    
    

    