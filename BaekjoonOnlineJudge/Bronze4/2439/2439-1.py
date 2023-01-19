stars = int(input())

for i in range(stars):
    print(' ' * (stars - i - 1), end='')
    print('*' * (i + 1))