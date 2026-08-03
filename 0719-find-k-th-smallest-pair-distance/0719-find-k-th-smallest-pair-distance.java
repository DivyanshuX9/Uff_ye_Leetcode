class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int right=nums[nums.length-1]-nums[0];

        while(left<right){
            int mid=left+(right-left)/2;

            if(count(nums,mid)>=k){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    public static int count(int nums[],int dist){
        int left=0;
        int c=0;

        for(int right=0;right<nums.length;right++){
            while(nums[right]-nums[left]>dist) left++;
            c+=right-left;
        }

        return c;
    }
}