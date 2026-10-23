class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        long pred=1;
        int n=nums.size();
        vector<int> ar(n,1);
        for(auto i=0;i<n;i++){
            ar[i]=pred;
            pred*=nums[i];
        }
        int suf=1;
        for(auto i=n-1;i>=0;i--){
            ar[i]*=suf;
            suf*=nums[i];
        }
        return ar;
    }
};