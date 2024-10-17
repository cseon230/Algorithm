arr = []
for i in range (9):
    NUM = int(input())
    arr.append(NUM)
print(max(arr))
print(arr.index(max(arr))+1)
