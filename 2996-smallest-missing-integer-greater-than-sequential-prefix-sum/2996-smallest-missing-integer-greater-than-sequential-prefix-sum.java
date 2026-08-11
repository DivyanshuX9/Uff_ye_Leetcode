class Solution {
    public int missingInteger(int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        
        for(int a=0;a<nums.length;a++){
            if(a==0 || nums[a]==nums[a-1]+1) sum+=nums[a];
            else break;
        }
        HashSet<Integer> gg=new HashSet<>();
        for(int a=0;a<nums.length;a++){
            if(nums[a]>=sum) gg.add(nums[a]);
        }
        int a;
        for(a=sum;a<=sum+50;a++){
            if(!gg.contains(a)) return a;
        }
        return a+1;
    }
}