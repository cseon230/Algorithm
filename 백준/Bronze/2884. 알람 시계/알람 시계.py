A, B = map(int, input().split())

if B < 45:
    if A == 0:
        A = 23
    else:
        A = A - 1
    if B == 0:
        B = 15
    else:
        B = 60 - (45 - B)
else:
    B = B - 45

print(A, B)