remain = int(input())

buttons = [300,60,10]
cnts = [0,0,0]     # A B C

isPossible = True

while remain!=0:
    if remain < 10:
        isPossible=False
        break
    
    for i in range(len(buttons)):
        if buttons[i] <= remain:
            cnts[i]+=(remain//buttons[i])
            remain%=buttons[i]
            break

if isPossible:
    print(cnts[0],cnts[1],cnts[2])
else:
    print(-1)
