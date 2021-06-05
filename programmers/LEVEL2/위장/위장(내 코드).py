from itertools import combinations

def solution(clothes):
    answer = 0
    hashtable = dict()
    for c in clothes:
        if c[1] not in hashtable:
            hashtable[c[1]] = 1
        else:
            hashtable[c[1]] += 1
    
    arr = list(hashtable.values())
    
    for a in arr:
        answer+=a
    
    
    for i in range(2,len(arr)+1):
        a = list(combinations(arr,i))
        for t in a:
            mid_result=1
            for num in range(i):
                mid_result*=t[num]
            answer+=mid_result
            
    return answer