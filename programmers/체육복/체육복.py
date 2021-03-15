def solution(n, lost, reserve):
    
    real_resrv = []
    real_lost = []
    can = [False]*(n+1)

    for r in reserve:
        if r not in lost:
            real_resrv.append(r)
            can[r] = True

    for l in lost:
          if l not in reserve:
            real_lost.append(l)
    
    answer = n - len(real_lost)

    for rl in real_lost:
        if rl-1 in real_resrv:
            if can[rl-1]:
                answer+=1
                can[rl-1] = False
                continue
            
        if rl+1 in real_resrv:
            if can[rl+1]:
                answer+=1
                
    return answer