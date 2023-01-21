stars = int(input())
for i in range(stars,0,-1):
    print(' ' * (stars - i), end='')
    print('*' * i)