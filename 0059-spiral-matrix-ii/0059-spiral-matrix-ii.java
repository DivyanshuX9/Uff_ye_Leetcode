class Solution {
    public int[][] generateMatrix(int n) {
        int num=0;
        int left=0;int right=n-1;int top=0;int bottom=n-1;
        int ar[][]=new int[n][n];
        while(top<=bottom && left<=bottom){
            for(int a=left;a<=right;a++)
                ar[top][a]=++num;
            top++;

            for(int a=top;a<=bottom;a++)
                ar[a][right]=++num;
            right--;

            if (top <= bottom) {
                for(int a=right;a>=left;a--)
                    ar[bottom][a]=++num;
                bottom--;
            }

            if (left <= right) {
            for(int a=bottom;a>=top;a--){
                ar[a][left]=++num;
            }
            left++;
            }
        }
        return ar;

    }
}