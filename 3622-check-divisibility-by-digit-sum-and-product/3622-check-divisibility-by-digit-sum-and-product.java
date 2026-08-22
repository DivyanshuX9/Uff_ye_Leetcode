class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;int prod=1;
        for(int a=n;a>0;a/=10){
            sum+=a%10;
            prod*=a%10;    
        }

        return n%(sum+prod)==0;
    }
}