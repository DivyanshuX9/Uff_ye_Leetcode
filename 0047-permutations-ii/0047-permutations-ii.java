class Solution {
    public static void per(int idx,int n,int ar[],Set<List<Integer>> gg){
        if(idx==n){
            List<Integer> temp=new ArrayList<>();
            for(int a:ar) temp.add(a);
            gg.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<n;i++){
            swap(ar,idx,i);
            per(idx+1,n,ar,gg);
            swap(ar,idx,i);
        }
        // while(idx+1<n && ar[idx]==ar[idx+1]) idx++;
    }
    public static void swap(int[] ar,int idx,int i){
        int temp=ar[idx];
        ar[idx]=ar[i];
        ar[i]=temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> gg=new HashSet<>();
        List<List<Integer>> cc=new ArrayList<>();
        per(0,nums.length,nums,gg);
        for(List<Integer> x:gg){
            cc.add(new ArrayList<>(x));
        }
        return cc;
    }
}