arr = []

for i in range (1, 31):
    arr.append(i)
    
for _ in range (1, 29):
    st = int(input())
    arr.remove(st)

arr.sort

print(*arr)
