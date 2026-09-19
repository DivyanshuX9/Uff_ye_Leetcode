class Solution {
    public int countPrimes(int n) {
        if(n==1 || n==0) return 0;
        boolean composite[]=new boolean[n];
        for(int a=2;a*a<n;a++){
            if(!composite[a]){
                for(int b=a*a;b<n;b+=a){
                    composite[b]=true;
                }
            }
        }

        int count=0;
        for(boolean a:composite){
            if(a==false) count++;
        }

        return count-2;
    }
}