class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double ans = INT_MIN;
        int left = 0;
        int sum = 0; int n = nums.size();
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if( (i - left +1) >= k ){
                double avg = (double)sum/k;
                ans =max(ans, avg);
                sum -= nums[left];
                left++;
            }
        }
        return ans;
    }
};