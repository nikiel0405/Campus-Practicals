shour = eval(input('enter starting hour : '))
sminute = eval(input('enter starting minute : '))
fhour = eval(input('enter ending hour : '))
fminute = eval(input('enter ending minute : '))
starting = (shour*60)+sminute
ending = (fhour*60)+fminute

if starting < 1080 :
    print('invalid starting time')
if ending > 0 and ending < 1080:
    print('invalid starting time')
    
if (starting >= 1080) and (ending<=1290):
    ptime = ending-starting
    time = ptime //60
    price = time*25
    print('you should be paid : R', price)
elif (starting >=1080) and (ending >1290):
    ptime = ((21-shour)*60)
    time1 = (ptime//60)*25
    ptime2 = ((fhour -21)*60)
    time2 =  (ptime2//60)*35
    price = time1+time2
    print('you should be paid : R', price)
elif (starting >=1290) and ending <=1439 :
    ptime= ((fhour-shour)*60) 
    price = (ptime//60)*35
    print('you should be paid : R', price)


     
    
    