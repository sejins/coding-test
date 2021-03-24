import sys

n = int(input())

people = list(map(int,sys.stdin.readline().split()))

people.sort() # O(1000)

result = 0
front_people_time = 0



for p in people:
    result+=(front_people_time+p)
    front_people_time+=p


print(result)