from math import factorial

R = int(input())
result = []
for i in range(R):
    num = list(map(int, input().split()))
    N, M = max(num), min(num)
    result.append(
        factorial(N) / (factorial(N - M) * factorial(M))
    )
for i in result:
    print(int(i))
