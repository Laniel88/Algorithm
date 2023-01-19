stars = int(input())

for i in range(stars):
    print(' ' * (stars - i - 1), end='')
    print('*' * (2 * i + 1))
for i in range(stars - 1, 0, -1):
    print(' ' * (stars - i), end='')
    print('*' * (i * 2 - 1))
