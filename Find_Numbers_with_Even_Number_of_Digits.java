class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    boolean even(int num)
    {
        int numberofdigits=digit(num);
        if(numberofdigits%2==0)
        {
        return true;
    }
    return false;
    }
    int digit(int num)
    {
        int count=0;
        while(num>0)
        {
           count++;
           num=num/10;
        }
