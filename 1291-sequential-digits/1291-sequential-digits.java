class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str="123456789";
        int winlow=Integer.toString(low).length();
        System.out.println(winlow);
        int winhigh=Integer.toString(high).length();
        System.out.println(winhigh);
        List<Integer> gg=new ArrayList<>();
        for(int a=winlow;a<=winhigh;a++){
            int r=a;
            while(r<=str.length()){
                int num=Integer.parseInt(str.substring(r-a,r));

                if(num>high) break;
                if(num>=low) gg.add(num);
                r++;
            }
        }
        return gg;
    }
}