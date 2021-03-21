class twosum
{
       public static int[] two(int[] nums, int target) 
		    {
		        int [] output=new int[2];
		        for(int i=0;i<=nums.length-1;i++)//outer loop
		        {
		            for(int j=i+1;i<=nums.length-1;j++)//checks for all the items in the given array
		            {
		                if(nums[i]+nums[j]==target)
		                {
		                    output[0]=i;
		                    output[1]=j;
		                    return output;
		                }
		            }
		        }
		        return output;
		        
 }
       public static void printarr(int[] arr)
       {
    	   for(int i=0;i<arr.length;i++)
    	   {
    		   System.out.print(arr[i]+" ");
    	   }
    	   System.out.println();
       }
       
		    public static void main(String[] args) 
		    {
				int[] a= {2,11,7,15,9};
				int b=9;
				int [] res=two(a,b);
				printarr(res);
				
			}
		}

