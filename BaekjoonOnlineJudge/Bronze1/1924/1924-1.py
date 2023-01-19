days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

dow = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

month, date = map(int, input().split())

cnt = 0
for i in range(month - 1):
    cnt += days[i]
cnt += date

print(dow[cnt % 7])
