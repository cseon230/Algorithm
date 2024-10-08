A = int(input())
B = int(input())

result1 = A*(B%10)
result2 = A*((B%100)//10)
result3 = A*(B//100)
result4 = result1 + int(str(result2) + '0') + int(str(result3) + '00')

print(result1)
print(result2)
print(result3)
print(result4)