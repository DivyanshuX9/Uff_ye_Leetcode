class Solution {
    public String convert(String s, int numRows) {
        // int n=s.length();
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int currentrow=0;
        boolean goingdown=false;
        for(char c:s.toCharArray()){
            rows[currentrow].append(c);
            if(currentrow==0 || currentrow==numRows-1){
                goingdown=!goingdown;
            }
            currentrow+=goingdown?1:-1;
        }
        StringBuilder str=new StringBuilder();
        for(StringBuilder b:rows){
            str.append(b);
        }
        return str.toString();
    }
}