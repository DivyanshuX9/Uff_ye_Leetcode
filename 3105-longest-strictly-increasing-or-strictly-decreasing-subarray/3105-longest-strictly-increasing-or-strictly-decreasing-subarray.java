class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int flag = 0;
        int l = 0;
        int sz = 1;
        int n = nums.length;
        int count = 1;
        int a = 1;
        while (a < n) {
            while (a < n && nums[a] < nums[a - 1]) {
                count++;
                a++;
            }
            sz = Math.max(count, sz);
            count = 1;
            while (a < n && nums[a] > nums[a - 1]) {
                count++;
                a++;
            }
            sz = Math.max(count, sz);
            count = 1;
            while(a<n && nums[a]==nums[a-1]) a++;
        }
        return sz;
    }
}