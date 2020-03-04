def leap (y, l):
    if (y%400 ==0 and y%100 == 0) or y%4==0:
        l[1] = 29
        return True
    else:
        return False
def endmonth (d, m, leap, l):
    if leap == True:
       
        if d == l[m-1]:
            return True
        else:
            return False
    else :
        if d == l[m-1]:
            return True
        else:
            return False        
        
    
def checkday(d, m,lea, l):
    if lea == True:
        if d == l[m-1]:
            return d
        else :
            return -1
    else :
        if d == l[m-1]:
            return d
        else :
            return -1 
def increment (d, m, y, l, lea): 
    if l ==True :
        d +=1
        if d > lea[m-1] and m !=12:
            d= 1 
            m+=1
        elif d > lea[m-1] and m ==12 :
            d =1
            m=1
            y +=1
    else :
        d +=1
        if d > lea[m-1] and m !=12:
            d= 1 
            m+=1
        elif d > lea[m-1] and m ==12 :
            d =1
            m=1
            y +=1
    return (d,'/', m,'/', y)


def main(d, m, y, i):
    return "previous Date:" +str(d)+'/'+str(m)+'/'+str(y)+' New date:'+str(i)
    
    
day = int(input('Enter day: '))
month = int(input('Enter month: '))
year = int(input('Enter year: '))
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
leap1 = leap(year, days)
print('is the year leap :', leap1)
isend = endmonth(day, month, leap1, days)
print('is it the end of the month:', isend)
cday = checkday(day, month, leap1, days)
print('is it the last day:', cday)
new = increment(day, month, year, isend, days)
print(main(day, month, year, new))