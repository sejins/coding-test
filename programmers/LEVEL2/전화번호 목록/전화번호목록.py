def solution(phone_book):
    answer = True
    h = dict()

    for p in phone_book:
        h[p]=1
    
    for p in phone_book:
        temp=""
        for num in p:
            temp+=num
            if temp in h and temp!=p:
                return False
    return answer