name = input()
freq = {}
for i in name:
    #check for presence
    if i not in freq:
        freq[i] = 1
        #if present increment the freq by factor of 1
    else:
        freq[i] += 1
print (freq)        