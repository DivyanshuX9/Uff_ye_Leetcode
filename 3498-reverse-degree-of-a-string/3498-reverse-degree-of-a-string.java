class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int n=s.length();
        for(int a=0;a<n;a++){
            sum+=(a+1)*Math.abs((s.charAt(a)-'a')-26);
        }

        return sum;
    }
}