if __name__ == "__main__":
    a, b = map(int, input().split())
    print(
        "{0}\n{1}\n{2}\n{3}\n{4}".format(
            a + b, a - b, a*b, int(a/b), a%b
        )
    )