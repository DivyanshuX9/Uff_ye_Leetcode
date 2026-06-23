class Solution {
    public boolean iss(char[][] board, Set<Character> op,int diag){
        if(diag==9) return true;
        for(int b=0;b<9;b++){
            if(board[diag][b]!='.' && op.contains(board[diag][b])) return false;
            op.add(board[diag][b]);
        }
        op.clear();
        for(int b=0;b<9;b++){
           if(board[b][diag]!='.' && op.contains(board[b][diag])) return false;
            op.add(board[b][diag]);
        }
        op.clear();
        return iss(board,op,diag+1);
    }
    public boolean diag(char [][]board,int box){
        if(box == 9) return true;

        int r = (box / 3) * 3;
        int c = (box % 3) * 3;
        Set<Character> gg=new HashSet<>();
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]!='.' && gg.contains(board[i][j])) return false;
                gg.add(board[i][j]);
            }
        }
       return diag(board, box + 1);
    }
    public boolean isValidSudoku(char[][] board) {
        Set<Character> op=new HashSet<>();
        return iss(board,op,0) && diag(board,0);
    }
}