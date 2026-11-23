class ProductOfNumbers {
    ArrayList<Integer> gg=new ArrayList<>();
    public ProductOfNumbers() {
    }
    
    public void add(int num) {
        gg.add(num);
    }
    
    public int getProduct(int k) {
        int l=gg.size();
        int prod=1;
        for(int a=gg.size()-1;a>=0 && a>=l-k;a--){
            prod*=gg.get(a);
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */