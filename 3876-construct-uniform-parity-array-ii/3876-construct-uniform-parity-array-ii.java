class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        int smo=Integer.MAX_VALUE;
        int sme=smo;
        for(int a:nums1){
            if(a%2==0) {
                sme=a<sme?a:sme;
                even++;
            }
            else {
                smo=a<smo?a:smo;
                odd++;
            }
        }

        if(odd==0 ||( smo<sme && smo!=0 && sme!=0)) return true;
        return false;
    }
}