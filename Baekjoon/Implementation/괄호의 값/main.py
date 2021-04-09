gwals = input()

stack = []
error_flag = False
result = 0

for g in gwals:
    if g == '(' or g == '[':
        stack.append(g)

    elif g == ')':
        temp = 0
        flag = False
        while stack:
            x = stack.pop()
            if x == '(':
                if temp==0:
                    stack.append(2)
                    flag = True
                    break

                else:
                    stack.append(2*temp)
                    flag = True
                    break

            elif x == '[':
                break
            else:
                temp+=x
        if not flag:
            error_flag = True

    elif g == ']':
        temp = 0
        flag = False
        while stack:
            x = stack.pop()
            if x == '[':
                if temp==0:
                    stack.append(3)
                    flag = True
                    break

                else:
                    stack.append(3*temp)
                    flag = True
                    break

            elif x == '(':
                break
            else:
                temp+=x
        if not flag:
            error_flag = True
    else:
        error_flag=True
        break


if error_flag:
    print(0)
else:
    for s in stack:
        if s!='(' and s!='[' and s!=')' and s!=']':
            result+=s
        else:
            error_flag=True
    if error_flag:
        print(0)
    else:
        print(result)




