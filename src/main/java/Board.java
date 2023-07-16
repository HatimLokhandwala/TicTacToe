public class Board {
//    private final char[][] grid;
//    Board() {
//        grid = new char[3][3];
//    }
//
//    public void markCharacterAtPosition(final char charToMark, int xCoordinate, int yCoordinate) {
//        grid[xCoordinate - 1][yCoordinate - 1] = charToMark;
//    }
//
//    /**
//     * @return
//     */
//    public BoardCharacter determineWinner() {
//        BoardCharacter returnChar;
//        for (int i = 0; i < grid.length; i++) {
//            returnChar = checkRow(grid[i]);
//            if (returnChar != BoardCharacter.EMPTY) {
//                return returnChar;
//            }
//        }
//        for (int i = 0; i < grid[0].length; i++) {
//            returnChar = checkColumn(grid, i);
//            if (returnChar != BoardCharacter.EMPTY) {
//                return returnChar;
//            }
//        }
//        returnChar = checkDiagonal(grid);
//        if (returnChar != BoardCharacter.EMPTY) {
//            return returnChar;
//        }
//        returnChar = checkOrthogonalDiagonal(grid);
//        return returnChar;
//    }
//
//    public BoardCharacter checkRow(char[] row) {
//        for (int j = 1; j < row.length; j++) {
//            if (row[j] != row[j - 1]) {
//                return BoardCharacter.EMPTY;
//            }
//        }
//        return BoardCharacter.valueOf("" + row[0]);
//    }
//
//    public BoardCharacter checkColumn(char[][] grid, int column) {
//        for (int j = 1; j < grid.length; j++) {
//            if (grid[j][column] != grid[j - 1][column]) {
//                return BoardCharacter.EMPTY;
//            }
//        }
//        return BoardCharacter.valueOf(String.valueOf(grid[0][column]));
//    }
//
//    public BoardCharacter checkDiagonal(char[][] grid) {
//        for (int j = 1; j < grid.length; j++) {
//            if (grid[j][j] != grid[j - 1][j - 1]) {
//                return BoardCharacter.EMPTY;
//            }
//        }
//        return BoardCharacter.valueOf(String.valueOf(grid[0][0]));
//    }
//
//    public BoardCharacter checkOrthogonalDiagonal(char[][] grid) {
//        int column = grid[0].length - 1;
//        for (int j = 1; j < grid.length; j++) {
//            if (grid[j][column - 1] != grid[j - 1][column]) {
//                return BoardCharacter.EMPTY;
//            }
//            column--;
//        }
//        return BoardCharacter.valueOf(String.valueOf(grid[0][0]));
//    }
}
