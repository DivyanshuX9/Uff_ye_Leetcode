class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public static boolean solve(char[][] board){
        for(int a=0;a<board.length;a++){
            for(int b=0;b<board[0].length;b++){
                if(board[a][b]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,a,b,c)){
                            board[a][b]=c;
                            if(solve(board)==true) return true;
                            else board[a][b]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char board[][],int row,int col,char num){
        for(int a=0;a<board.length;a++){
            if(board[a][col]==num){
                return false;
            }
            if(board[row][a]==num){
                return false;
            }

            if(board[3*(row/3)+a/3][3*(col/3)+a%3]==num) return false;
        }
            return true;

    }
}