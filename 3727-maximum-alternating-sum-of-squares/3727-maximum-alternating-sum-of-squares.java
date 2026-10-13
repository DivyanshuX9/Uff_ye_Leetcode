class Solution {
    public long maxAlternatingSum(int[] nums) {
        int l=nums.length;
        for(int a=0;a<l;a++){
            if(nums[a]<0) nums[a]*=-1;
        }
        Arrays.sort(nums);
        int o=l/2;
        long sum=0;
        for(int a=l-1;a>=o;a--){
            sum+=Math.pow(nums[a],2);
            System.out.println(nums[a]);
        }
        for(int a=o-1;a>=0;a--){
            sum-=Math.pow(nums[a],2);
            System.out.println(nums[a]);
        }

        return sum;
    }
}