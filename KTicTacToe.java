import java.util.Scanner;

public class KTicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int emptyCount = 0;
        for (int i = 0; i < 3; i++) {
            String line = sc.next(); 
            for (int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == '.') {
                    emptyCount++;
                }
            }
        }
        boolean xWins = hasWon(board, 'X');
        boolean oWins = hasWon(board, 'O');
        if (xWins) {
            System.out.println("Player X has won!"); 
        } else if (oWins) {
            System.out.println("Player O has won!"); 
        } else if (emptyCount == 0) {
            System.out.println("Draw"); 
        } else {
            System.out.println("Game is still in progress"); 
        }
    }
    static boolean hasWon(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        
        return false; 
    }
}