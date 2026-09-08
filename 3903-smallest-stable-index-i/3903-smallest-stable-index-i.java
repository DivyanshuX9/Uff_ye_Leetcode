class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length-1;
        int max[]=new int[n+1];
        for(int a=0;a<=n;a++){
            if(a==0) max[a]=nums[a];
            else max[a]=Math.max(max[a-1],nums[a]);
        }

        int min[]=new int[n+1];
        for(int a=n;a>=0;a--){
            if(a==n) min[a]=nums[a];
            else min[a]=Math.min(min[a+1],nums[a]);
        }

        for(int a=0;a<=n;a++){
            if(max[a]-min[a]<=k) return a;
        }
        return -1;
    }
}