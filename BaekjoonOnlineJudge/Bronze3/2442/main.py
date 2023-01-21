stars = int(input())

for i in range(stars):
    print(' ' * (stars - i - 1), end='')
    print('*' * (2 * i + 1))