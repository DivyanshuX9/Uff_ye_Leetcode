class Solution {
    public int longestSubsequence(int[] nums) {
        int l=0;
        int r=1;
        int xor[]=new int[nums.length];
        int max=0;
        xor[0]=nums[0];
        while(r<nums.length){
            xor[r]=xor[r-1]^nums[r];
            r++;
        }
        if(xor[r-1]!=0) return r;

        for(int a=r-1;a>=0;a--){
            if((xor[r-1]^nums[a])!=0) return r-1;
        }

        return max;
    }
}