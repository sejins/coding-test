def solution(clothes):
    answer = 1
    dict_clothes = {}

    for clothes in clothes:
        if clothes[1] in dict_clothes:
            dict_clothes[clothes[1]] += 1
        else:
            dict_clothes[clothes[1]] = 1

    kind = list(dict_clothes.keys())

    for name in kind:
        answer *= dict_clothes.get(name) + 1

    return answer - 1