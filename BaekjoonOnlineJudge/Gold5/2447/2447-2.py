"""
'시간 초과' 코드임.
> (재귀로 풀어내지 않으면 힘들 듯)
"""

from math import ceil

N = int(input())


# N이 3의 몇승인지 구한다
def getExponent():
    for i in range(1, 9):
        if (N == 3**i):
            return i


exp = getExponent()

# row, column 각각의 좌표 값에 대해 별 여부(valid 값) 결정
# 총 3 구역으로 나눠 중간 구역에 False 저장
# 나누는 단위는 작은 단위부터 시작해, 큰 단위로 (3, 9... ~ N)
# 한번 False는 무조건 False -> break로 반복문 종료
for row in range(1, N + 1):
    for column in range(1, N + 1):
        valid = True
        for i in range(exp, 0, -1):
            unit = 3 ** (i - 1)
            row_converted = ceil(row / unit)
            column_converted = ceil(column / unit)
            if (row_converted % 3 == 2 and column_converted % 3 == 2):
                valid = False
                break

        if (valid == True):
            print('*', end='')
        else:
            print(' ', end='')
    print()
