class Solution {
    public int[] resultArray(int[] nums) {
        int l=nums.length;int l1,l2;
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();

        ar1.add(nums[0]);
        ar2.add(nums[1]);
        for(int a=2;a<l;a++){
            if(ar1.get(ar1.size()-1)>ar2.get(ar2.size()-1)) ar1.add(nums[a]);
            else ar2.add(nums[a]);
        }
        int res[]=new int[l];
        int s=0;
        for(int a:ar1){
            res[s++]=a;
        }
        for(int a:ar2){
            res[s++]=a;
        }

        return res;
    }
}