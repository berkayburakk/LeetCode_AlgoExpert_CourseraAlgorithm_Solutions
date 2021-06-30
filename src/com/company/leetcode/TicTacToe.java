package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

class Player{
    Map<Integer,Integer> row;
    Map<Integer,Integer> col;
    Map<Integer,Integer> diag;
    Player(){
        row = new HashMap<>();
        col = new HashMap<>();
        diag = new HashMap<>();
    }
    public boolean putChess(int[] move){
        row.put(move[0],row.getOrDefault(move[0],0)+1);
        if(row.get(move[0])==3){
            return true;
        }
        col.put(move[1],col.getOrDefault(move[1],0)+1);
        if(row.get(move[1])==3){
            return true;
        }
        if(move[0]+move[1]==2){
            diag.put(2,diag.getOrDefault(2,0)+1);
            if(diag.get(2)==3){
                return true;
            }
        }
        if(move[0]==move[1]){
            diag.put(0,diag.getOrDefault(0,0)+1);
            if(diag.get(0)==3){
                return true;
            }
        }
        return false;
        }
}

public class TicTacToe {
    public static void main(String[] args) {
        int[][]  matriks = new  int[][] { {0, 0}, {1, 1}, {2, 2},{3, 3} };
        tictactoe(matriks);

    }
    public static String tictactoe(int[][] moves) {
        Player player1 = new Player();
        Player player2 = new Player();
        for (int i = 0; i < moves.length; i++) {
            if(i %2 ==0){
                System.out.println("A player's moves");
                if(player1.putChess(moves[i])){
                    return "A";
                }
            }
            if(i%2==1) {
                System.out.println("B player's moves");
                if(player2.putChess(moves[i])){
                    return "B";
                }
            }
            }
        return moves.length ==9? "Draw" : "Pending";
    }

    int n = 3;
    public String tictactoeSecondExample(int[][] moves) {
        char[][] board = new char[n][n];
        for(int i = 0; i < moves.length; i++){
            int row = moves[i][0];
            int col = moves[i][1];
            if((i & 1) == 0){
                //even, X's move
                board[row][col] = 'X';
                if(didWin(board, row, col, 'X')) return "A";
            }else{
                //odd, O's move
                board[row][col] = 'O';
                if(didWin(board, row, col, 'O')) return "B";
            }
        }
        return moves.length == n * n ? "Draw" : "Pending";
    }
    private boolean didWin(char[][] board, int row, int col, char player){
        //check the current row
        boolean didPlayerWin = true;
        for(int i = 0; i < n; i++){
            if(board[row][i] != player){
                didPlayerWin = false;
            }
        }
        if(didPlayerWin) return true;   //player has won the game

        //check the current col
        didPlayerWin = true;
        for(int i = 0; i < n; i++){
            if(board[i][col] != player){
                didPlayerWin = false;
            }
        }
        if(didPlayerWin) return true;   //player has won the game

        //check the diagonal
        if(row == col){
            didPlayerWin = true;
            for(int i = 0; i < n; i++){
                if(board[i][i] != player){
                    didPlayerWin = false;
                }
            }
            if(didPlayerWin) return true;   //player has won the game
        }
        if(col == n - row - 1){
            didPlayerWin = true;
            for(int i = 0; i < n; i++){
                if(board[i][n-i-1] != player){
                    didPlayerWin = false;
                }
            }
            if(didPlayerWin) return true;   //player has won the game
        }

        //player did not win
        return false;
    }

    public String tictactoeThirdExamples(int[][] moves) {
        int n = moves.length;
        if (n < 5) {
            return "Pending";
        } else if (n < 9) {
            if (wonByLastMove(moves)) {
                return n % 2 == 1 ? "A" : "B";
            } else {
                return "Pending";
            }
        }
        return wonByLastMove(moves) ? "A" : "Draw";
    }
    private boolean wonByLastMove(int[][] moves) {
        int[] lastMove = moves[moves.length-1];
        int row = 1, col = 1, diag = 1, revDiag = 1;

        for (int i = moves.length-3; i >= 0; i -= 2) {
            int[] curr = moves[i];
            if (curr[0] == lastMove[0]) row++;
            if (curr[1] == lastMove[1]) col++;
            if (curr[0] == curr[1] && lastMove[0] == lastMove[1]) diag++;
            if (curr[0] + curr[1] == 2 && lastMove[0] + lastMove[1] == 2) revDiag++;
        }
        return row == 3 || col == 3 || diag == 3 || revDiag == 3;
    }

    public String tictactoeFourth(int[][] moves) {
        int n = moves.length;
        if (n < 5) {
            return "Pending";
        } else if (n < 9) {
            if (wonByLastMove(moves)) {
                return n % 2 == 1 ? "A" : "B";
            } else {
                return "Pending";
            }
        }
        return wonByLastMove(moves) ? "A" : "Draw";
    }
    private boolean wonByLastMoveForFourth(int[][] moves) {
        int[] lastMove = moves[moves.length-1];
        int row = 1, col = 1, diag = 1, revDiag = 1;

        for (int i = moves.length-3; i >= 0; i -= 2) {
            int[] curr = moves[i];
            if (curr[0] == lastMove[0]) row++;
            if (curr[1] == lastMove[1]) col++;
            if (curr[0] == curr[1] && lastMove[0] == lastMove[1]) diag++;
            if (curr[0] + curr[1] == 2 && lastMove[0] + lastMove[1] == 2) revDiag++;
        }
        return row == 3 || col == 3 || diag == 3 || revDiag == 3;
    }

}
