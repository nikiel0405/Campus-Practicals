degrees = float(input('Enter the temperature in degrees celsius : ')) # gets the user input and assigns it to variable degrees
convert = degrees*(9/5) # users input is converted to fahrenheit and is assigned to variable convert
sdegree = str(degrees) + ' degrees celcius' # the user input is converted to a string and is joined to the phrase degrees celsius and assigned to var sdegree
sconvert = str(convert)+' degrees fahrenheit' # the convert value to converted to a string and joined to the phrase degrees fahrenheit and is assigned to var sconvert
print(sdegree ,sconvert, sep = '-->')# var sdegree and var sconvert is displayed with a -> seperating them using the sep function