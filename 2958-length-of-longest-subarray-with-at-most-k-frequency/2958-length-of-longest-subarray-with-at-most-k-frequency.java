class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l=0,r=0;
        int max=0,count=0;
        Map<Integer,Integer> gg=new HashMap<>();
        while(r<nums.length){
            count=gg.getOrDefault(nums[r],0)+1;
            gg.put(nums[r],count);

            while(l<nums.length && gg.get(nums[r])>k){
                gg.put(nums[l],gg.get(nums[l])-1);
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;

        }
        return max;
    }
}