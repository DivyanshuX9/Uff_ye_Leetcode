class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;

        // String s=n.toString();

        // int l=s.length();

        // l/=3;
        
        return (n-1000)+1;
    }
}