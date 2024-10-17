N = int(input())
arr = list(map(int, input().split()))
min = arr[0]
max = arr[0]
for num in arr[1:]:
    if min > num:
        min = num
    if max < num:
        max = num
print(min, max)