public class GameEngine {
private char[][]board;
private char currentplayer;

 public GameEngine() {
  board = new char[3][3];
  currentPlayer = 'X';
  initializeBoard();
 }

 private void initializeBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                board[i][j] = '-';

            }

        }

    }

    

    // TODO: Implement game logic methods

}

EOF  
for (int i = 0; i < 3; i++) {
for (int j = 0 ; j < 3; j++) {
board[i][j] = '-';
}
}
}
//TODO: implement game logic methods
}
