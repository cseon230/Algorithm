N, M = map(int, input().split())

arr = []

for i in range(1, N+1):
    arr.append(i)

for _ in range (M):
    i, j = map(int, input().split())
    arr[i-1:j] = arr[i-1:j][::-1]

print(*arr)