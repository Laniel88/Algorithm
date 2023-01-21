if __name__ == "__main__":
    while True:
        A, B= map(int,input().split())

        if (A, B) == (0, 0):
            break
        else:
            print(A + B)