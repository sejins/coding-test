from collections import deque
import sys

t = int(input())

for _ in range(t):
    rev = False
    is_error = False
    p = sys.stdin.readline().rstrip()
    n = int(input())
    nums = sys.stdin.readline().rstrip()
    nums = nums.lstrip('[').rstrip(']').split(',')
    queue = deque(nums)
    if nums[0]=='':
        length = 0
    else:
        length = len(nums)
    print(queue)

    for f in p:
        if f == 'R':
            rev = not rev
        if f == 'D':
            if length==0:
                is_error=True
                break
            if not rev:
                queue.popleft()
            else:
                queue.pop()
            length-=1
            print(queue)

    if is_error:
        print('error')
    else:
        if not rev:
            str = ','.join(list(queue))
        else:
            str = ','.join(reversed(list(queue)))
        print('['+str+']')