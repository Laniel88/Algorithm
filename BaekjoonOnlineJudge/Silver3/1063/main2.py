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

