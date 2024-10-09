A = int(input())
B = int(input())

if A > 0 and B > 0:
    N = 1
elif A < 0 and B > 0:
    N = 2
elif A > 0 and B < 0:
    N = 4
else:
    N = 3
    
print(N)