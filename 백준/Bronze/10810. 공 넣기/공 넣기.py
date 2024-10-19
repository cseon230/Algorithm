N, M = map(int, input().split())

arr = [0] * N # 처음에 모든 바구니를 0 으로 초기화

for _ in range (1, M+1): # 1부터 5까지 순회
    i, j, k = map(int, input().split()) # i부터 j 바구니 까지 k값을 넣는다
    for x in range (i, j+1): # i부터 j까지 순회
        arr[x-1] = k

print(*arr)
