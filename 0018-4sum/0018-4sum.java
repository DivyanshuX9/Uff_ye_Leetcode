class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>  gg=new ArrayList<>();
        for(int a=0;a<nums.length;a++){
             if(a > 0 && nums[a] == nums[a - 1]) continue;

            for(int b=a+1;b<nums.length;b++){
                 if(b > a+1 && nums[b] == nums[b - 1]) continue;

                int l=b+1;
                int r=nums.length-1;
                long s=(long)target-nums[a]-nums[b];
                while(l<r){
                    
                    long q=nums[l]+nums[r];
                    if(s==q){
                        gg.add(Arrays.asList(nums[a], nums[b], nums[l], nums[r]));
                        l++;
                        r--;
                        while(l < r && nums[l] == nums[l - 1]) l++;
                        while(l < r && nums[r] == nums[r + 1]) r--;
                        }
                    else if(s>q) l++;
                    else r--;
                    }
                }
            }
        return gg;    
    }
}