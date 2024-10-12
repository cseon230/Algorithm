total = int(input())
kind = int(input())
N = 0

for i in range (kind):
    A, B = map(int, input().split())
    N += (A*B)
    
if total == N:
    print("Yes")
else:
    print("No")
   