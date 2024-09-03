def even(li):
    #iterate on the list li
    for i in li:
        #check for even elements
        if i % 2 == 0:
           print(i, end = " " )

lst = [1,2,3,4,5,6,7,8]      
even(lst)
           