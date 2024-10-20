arr = []

for _ in range (10):
    N = int(input())
    arr.append( N % 42)
    
setArr = set(arr)
listARr = list(setArr)

print(len(setArr))