class Solution {
    public long findTheArrayConcVal(int[] nums) {
    int i=0;
    int j= nums.length-1;
    long sum=0;
    while(i<=j)
    {
    if(i==j)
    {
    sum+=nums[i];
    }
    else
    {
    sum+=concatenatedNumber(nums[i], nums[j]);
    }
    i++;
    j--;
    }
    return sum;
    }
    private long concatenatedNumber(int a , int b)
    {
    long concatenatedNumber=0;
    int placeValue=1;
    while(b!=0)
    {
    concatenatedNumber+=placeValue*(b%10);
    placeValue*=10;
    b/=10;
    }
    while(a!=0)
    {
    concatenatedNumber+=placeValue*(a%10);
    placeValue*=10;
    a/=10;
    }
    return concatenatedNumber;
    }
 }
    
