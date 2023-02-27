class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int r=0; r<accounts.length; r++)
        {
            int sum=0;
            for(int c=0; c<accounts[r].length; c++)
            {
                sum+=accounts[r][c];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
}
