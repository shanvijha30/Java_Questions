public class subarray
{
public static void main(String args[])
{
int [] array={1,2,3,4}
int k=10;
int size= array.length;
int ans = countsubarray(array, size, k);
System.out.println(ans);
}
static int countsubarray(int [] array, int n, int k)
{
int i,j,mul;
int count=0;
for(i=0; i<n; i++)
{
if(array[i]<k)
count++;
mul=array[i];
for(j=i+1; j<n; j++)
{
mul=mul*array[j];
if(mul<k)
count++;
else
break;
}
}
return count;
}
}



