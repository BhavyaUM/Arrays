package Arrays;

public class bubble {

	public static void main(String[] args) {
       int a[]= {5,10,43};
       for(int i=0;i<a.length-1;i++)
       {
    	   for(int j=0;j<a.length-1-i;j++)
    	   {
    		   if(a[j]>a[j+1])
    		   {
    			   int temp=a[j];
        		   a[j]=a[j+1];
        		   a[j+1]=temp;  
    		   }
    	   }
       }
    	   System.out.println("after sorting:");
    	   for(int i=0;i<a.length;i++)
    	   {
    		   System.out.print(a[i]+" ");
    	   }
    	   
       }

	}
