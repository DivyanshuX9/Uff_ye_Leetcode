class Solution {
    public int minMoves2(int[] nums) {
        int med=0;
        Arrays.sort(nums);
        med=nums[nums.length/2];
        int sum=0;
        for(int a:nums){
            sum+=Math.abs(med-a);
        }
    return sum;
    }

}