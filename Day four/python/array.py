def check_number(array,number):
 array=[]
for number in range(len(array)):
 two_number= false
 for count in range(number+1,len(array)):
    if(array[number]+array[count]==number):
       array,append(array[count])
       two_number = true
        break
        if (two_number):
        array.append(array[number])
        break
        return array
