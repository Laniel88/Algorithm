"""
시간초과 코드임.
C++과 같은 알고리즘으로 풀었음에도 시간초과가 뜸.

+ 인덱스를 0부터 시작하는 것이 구역을 구분하는데 유리함.
  (2447-2.py 코드와 다르게 올림/내림 없이 그냥 몫으로 처리할 수 있음)
"""

def drawStar(row: int, column: int, unit: int):
    row_converted = row // unit
    column_converted = column // unit

    if (row_converted % 3 == 1 and column_converted % 3 == 1):
        print(' ', end='')
    else:
        if (unit == 1):
            print('*', end='')
        else:
            drawStar(row, column, unit / 3)

N = int(input())

for row in range(0, N):
    for column in range(0, N):
        drawStar(row, column, N / 3)
    print()