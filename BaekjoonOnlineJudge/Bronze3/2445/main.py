N = int(input())

for i in range(1, N):
    print('*' * i, end='')
    print(' ' * (2 * N - 2 * i), end='')
    print('*' * i)
for i in range(N, 0, -1):
    print('*' * i, end='')
    print(' ' * (2 * N - 2 * i), end='')
    print('*' * i)
