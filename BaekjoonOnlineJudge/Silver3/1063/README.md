# 킹

https://www.acmicpc.net/problem/1063

## Submits

- [ ] C
- [ ] C++
- [x] Python3


## ChatGPT

### 1 
This code takes as input the positions of a king and a rock on a chess board, and a number of moves the king will make. For each move, the code updates the position of the king and the rock on the chess board, and then prints the final positions of the king and the rock.

There are a few things that can be improved in this code. First, the COLUMN and ROW lists can be combined into a single list of tuples, each containing a column and a row. This will make it easier to index the chess board.

Next, the getIndex and getValue functions can be combined into a single function that takes a position in the form "A1" and returns the corresponding index in the COLUMN and ROW lists. This function can also be used to convert a pair of indices into a position string.

The checkValidity function can be simplified by using the all function, which checks whether all elements of an iterable are True. In this case, we can use all to check whether both indices in coordList are in the range 0-7.

Finally, the code can be made more readable by using more descriptive variable names and by adding comments to explain what each part of the code does. Here is an improved version of the code:


### 2
This code looks like a chess game for two pieces: a king and a rock. The king can move one step in any direction, whereas the rock can move in a horizontal or vertical line without being blocked by other pieces.

One improvement that can be made to the code is to use a class to represent the king and the rock. This would allow us to define the move logic for each piece in the class, and make the code more modular and reusable.

Additionally, the getIndex(), getValue(), and moveIndex() functions can be simplified and made more readable. Here is how I would rewrite the code:

```python
class Piece:
    def __init__(self, position):
        self.column = position[0]
        self.row = position[1]

    def move(self, direction):
        # Update the piece's position based on the direction
        if direction == 'R':
            self.column = min(self.column + 1, 7)
        elif direction == 'L':
            self.column = max(self.column - 1, 0)
        elif direction == 'B':
            self.row = max(self.row - 1, 0)
        elif direction == 'T':
            self.row = min(self.row + 1, 7)

    def __str__(self):
        # Return the piece's position as a string
        return chr(self.column + ord('A')) + str(self.row + 1)

def checkValidity(piece, other_piece):
    # Check if the piece is still on the board
    if piece.column < 0 or piece.column > 7 or piece.row < 0 or piece.row > 7:
        return False

    # Check if the piece is trying to move to the position of the other piece
    if piece == other_piece:
        return False
    
    return True
```

### 3
```python
class Piece:
    COLUMN = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']
    ROW = ['1', '2', '3', '4', '5', '6', '7', '8']

    def __init__(self, column, row):
        self.coordList = [self.COLUMN.index(column), self.ROW.index(row)]

    def get_index(self):
        return self.coordList

    def get_value(self):
        return self.COLUMN[self.coordList[0]] + self.ROW[self.coordList[1]]

    def move(self, move):
        if len(move) == 1:
            if (move == 'R'):
                self.coordList[0] += 1
            elif (move == 'L'):
                self.coordList[0] -= 1
            elif (move == 'B'):
                self.coordList[1] -= 1
            elif (move == 'T'):
                self.coordList[1] += 1
        else:
            self.move(move[0])
            self.move(move[1])

    def check_validity(self):
        if self.coordList[0] in range(8) and self.coordList[1] in range(8):
            return True
        else:
            return False
```