class Solution {
    public int maxProduct(int[] nums) {
        int i=Integer.MIN_VALUE,j=Integer.MIN_VALUE;

        for(int a:nums){
            if(a>i){
                j=i;
                i=a;
            }else if(a>j){
                j=a;
            }
        }
        return (i-1)*(j-1);
    }
}