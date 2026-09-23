class Solution {
    public int minOperations(int[] nums, int x) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int count = -1;
        int sum = 0;
        int b = 0;
        for (int a = 0; a < n; a++) {
            b += nums[a];
        }
        x = b - x;
        if(x==0) return n;
        while (r < n) {
            sum += nums[r];
            while (sum >= x && l < n) {
                if (sum == x) {
                    count = Math.max(count, r - l + 1);
                }
                sum -= nums[l++];
            }
            r++;
            // System.out.println(l+" "+r+" "+sum+" "+count);
        }
        if(count==-1) return -1;
        return Math.abs(n - count);
    }
}