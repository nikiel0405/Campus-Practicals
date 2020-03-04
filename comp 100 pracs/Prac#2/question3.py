weig = eval(input('enter weight of parcel in kg '))
if weig < 2 or weig ==2 :
    price = 125;
elif weig  > 2 :
    extra = weig-2
    temp= extra//1
    if extra%temp>0:
        temp= temp+1
    price =125 +(temp*55)
print('the parcel of', weig,'kg , will cost : R',price)