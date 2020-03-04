from random import *
h1 = 0 
h2 = 0
h3 = 0
sum1 = 0
sum2 = 0
sum3 = 0
for i in range(10):# how many chnaces they get to rol the dice
    for j in range(2) :# times dice was thrown
        play1 = randrange(1,6)
        if h1<play1:
            h1 = play1
        play2 = randrange(1,6)
        if h2 < play2 :
            h2 = play2
        play3 = randrange(1,6)
        if h3<play3:
            h3=play3
    sum1+=h1# sum of player1
    sum2+=h2# sum of player2
    sum3+=h3# sum of player3
high = sum1
if sum2 >high and sum2> sum3:
    print('player 2 is the lucky winner they obtained', sum2,'points')
elif sum3>high and sum3 >sum2:
    print('player 3 is our lucky winner, they obtained ', sum3, 'points')
else:
    print('player 1 is our lucky winner they obtained', sum1, 'points')   
''' from line 23 to 28 we calculate which of the 3 players had the highest score and therefore become the winner'''
'''from line 10 to 18 we calculate the output of the di i.e the score which the di will have after the throw'''