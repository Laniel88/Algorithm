COLUMN = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']
ROW = ['1', '2', '3', '4', '5', '6', '7', '8']


def getIndex(column, row):
    return [COLUMN.index(column), ROW.index(row)]


def getValue(coordList):
    return COLUMN[coordList[0]] + ROW[coordList[1]]


def moveIndex(coordList, move):
    if len(move) == 1:
        if (move == 'R'):
            return [coordList[0] + 1, coordList[1]]
        elif (move == 'L'):
            return [coordList[0] - 1, coordList[1]]
        elif (move == 'B'):
            return [coordList[0], coordList[1] - 1]
        elif (move == 'T'):
            return [coordList[0], coordList[1] + 1]
    else:
        return moveIndex(
            moveIndex(coordList, move[0]),
            move[1],
        )

def checkValidity(coordList):
    if coordList[0] in range(8) and coordList[1] in range(8):
        return True
    else:
        return False


if __name__ == "__main__":
    cmd = input().split()
    # get king and rock variable as a list by indexing string
    king = getIndex(cmd[0][0], cmd[0][1])
    rock = getIndex(cmd[1][0], cmd[1][1])
    # N : 움직이는 횟수
    cnt = int(cmd[2])

    for _ in range(cnt):
        """
        - Make a temporary move in _king, _rock
        - Check if the move is valid and save data.
        """
        move = input()

        _king = moveIndex(king, move)
        valid = checkValidity(_king)
        if _king == rock:
            _rock = moveIndex(rock, move)
            valid = valid and checkValidity(_rock)

            if valid:
                king, rock = _king, _rock
        else:
            if valid:
                king = _king

    print(getValue(king))
    print(getValue(rock))