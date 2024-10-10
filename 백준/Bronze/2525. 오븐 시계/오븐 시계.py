H, M = map(int, input().split())
COOK_TIME = int(input())
total_minutes = (H * 60 + M) + COOK_TIME

H = (total_minutes // 60) % 24
M = total_minutes % 60

print(H, M)
