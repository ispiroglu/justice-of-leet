class Solution {
  public boolean isValidSudoku(char[][] board) {
    return checkRows(board) && checkColumns(board) && checkThreesArea(board);
  }

  private boolean checkRows(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      Set<Character> charSet = new HashSet<>();
      for (int j = 0; j < board.length; j++) {
        char c = board[i][j];

        if (c == '.')
          continue;
        if (charSet.contains(c))
          return false;
        charSet.add(c);
      }
    }
    return true;
  }

  private boolean checkColumns(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      Set<Character> charSet = new HashSet<>();
      for (int j = 0; j < board.length; j++) {
        char c = board[j][i];

        if (c == '.')
          continue;
        if (charSet.contains(c))
          return false;
        charSet.add(c);
      }
    }
    return true;
  }

  private boolean checkThreesArea(char[][] board) {
    for (int i = 0; i < board.length; i = i + 3) {
      for (int j = 0; j < board.length; j = j + 3) {
        Set<Character> charSet = new HashSet<>();
        for (int k = i, columnChecker = 0; columnChecker < 3; columnChecker++, k++) {
          for (int l = j, rowChecker = 0; rowChecker < 3; rowChecker++, l++) {
            char c = board[k][l];
            if (c == '.')
              continue;
            if (charSet.contains(c))
              return false;
            charSet.add(c);
          }
        }
      }
    }
    return true;
  }
}