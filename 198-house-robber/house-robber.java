class Solution {
    public int rob(int[] nums) {
        int num=0;
        int max=0;
        for(int c:nums)
        {
            int temp=Math.max(max,c+num);
            num=max;
            max=temp;

        }
        return max;


    }
}