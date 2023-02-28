public class OrderAgnosticBinarySearch
{
public static void main(String args[])
{
int [] arr={-18,-12,-4,0,2,3,4,15,16,22,45,89}
int target=22;
int ans=orderagnosticbinarysearch(arr,target);
System.out.println(ans);
}
static int orderagnosticbinarysearch(int[] arr, int target)
{
int start=0;
int target=arr.length-1;
boolean isAsc=arr[start]<arr[end];
while(start<=end)
{
int mid= start+(end-start)/2;
if(arr[mid]==target)
{
return mid;
}
if(isAsc)
{
if(target<arr[mid])
{
end=mid-1;
}
else
{
start=mid+1;
}
}
else
{
if(target>arr[mid])
{
end=mid-1;
}
else
{
start=mid+1;
}
}
}
return -1;
}
}

