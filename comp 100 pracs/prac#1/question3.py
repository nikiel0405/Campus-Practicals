start = float(input('enter starting odometer reading : '))  
finish = float(input('enter the final odometer reading : '))
tank = float(input('enter fuel tank capacity : '))
rate = (finish-start)/tank
print('The rate of fuel consumption',rate, 'km/l')
""" user is asked to enter the starting and ending reading of the odometer
they are also asked to enter to enter the fuel tanks capacity 
the starting reading is assigned to var start
the ending reading is assigned to var finish
the fuel tanks capacity is assigned to var tank
the rate of consumption is measured by first finding the difference in readings from start to finish and then dividing that total by the fuel tanks capacity
and assigning that value to rate
the rate is then displayed with units km/l"""
