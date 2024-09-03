lst = [1,2,3,1,2,4]
def unique(li):
    new = []
    #iterate on the li list
    for i in li:
        #we are adding only unique elements in new list
        if i not in new:
            new.append(i)
    #return the list
    return new
print(unique(lst))