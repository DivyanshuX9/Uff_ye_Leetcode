class Solution {
    public void func(int n,int k,int idx,List<Integer> cc,List<List<Integer>> gg){
        if(cc.size()==k){
            gg.add(new ArrayList<>(cc));
            return;
        }
        for(int i=idx;i<=n;i++){
            cc.add(i);
            System.out.println(cc);
            func(n,k,i+1,cc,gg);
            cc.remove(cc.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> cc=new ArrayList<>();
        List<List<Integer>> gg=new ArrayList<>();
        func(n,k,1,cc,gg);
        return gg;
    }
}