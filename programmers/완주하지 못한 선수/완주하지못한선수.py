def solution(participant, completion):
    answer = ''
    h = dict()
    for p in participant:
      h[p]=0
    for p in participant:
      h[p]+=1
    for c in completion:
      if h[c]==1:
        del h[c]
      else:
        h[c]-=1
    
    arr = list(h.keys())
    answer = arr[0]
    return answer