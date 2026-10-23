class Solution {
public:
    int sortPermutation(vector<int>& nums) {
        int k=-1;
        for(int a=0;a<nums.size();a++){
            if(nums[a]!=a){
                if(k==-1) k=nums[a];
                else k&=nums[a];
            } 
        }
        return k==-1?0:k;
    }
};