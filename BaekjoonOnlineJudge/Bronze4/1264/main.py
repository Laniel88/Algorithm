vowelList = ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
vowelCntList = []
while True:
    line = input()
    if (line == '#'):
        break

    vowel = 0
    for word in line:
        if word in vowelList:
            vowel += 1
    vowelCntList.append(vowel)

for cnt in vowelCntList:
    print(cnt)
