A, B, C = map(int, input().split())
dice = [A, B, C]
dice.sort() # 오름차순 정렬
uniqueDice = set(dice) # set을 사용하여 중복을 제거한 값을 반환

if len(uniqueDice) == 1:
    print(10000 + dice[0] * 1000)
elif len(uniqueDice) == 2:
    print(1000 + dice[1] * 100)
else:
    print(dice[2]*100)