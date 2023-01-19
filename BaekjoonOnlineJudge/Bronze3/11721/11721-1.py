input = input()

for i in range(len(input)):
    print(input[i], end='\n' if i % 10 == 9 else '')
