class Solution {
    public int threeSumClosest(int[] ar, int target) {
        Arrays.sort(ar);
        int min = Integer.MAX_VALUE, output = 0;
        for (int a = 0; a < ar.length; a++) {
            int l = a + 1;
            int r = ar.length - 1;
            while (l < r) {
                int sum = ar[a] + ar[l] + ar[r];
                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    output = sum;
                }
                if (sum < target)
                    l++;
                else if (sum > target)
                    r--;
                else
                    return target;
            }
        }
        return output;
    }
}