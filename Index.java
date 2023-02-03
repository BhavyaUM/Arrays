package Arrays;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s1.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.println("the elements present inside an array");
		for(int j=0;j<a.length;j++)
			{
				System.out.println(a[j]);
			}
		System.out.println("enter the element to be search");
	    int key=s1.nextInt();
	    int count=0;
	    int i;
	    for(i=0;i<a.length;i++)
	    {
	    	if(a[i]==key)
	    	{
	    	 count=1;
	    	 break;
	    	}
	    }
	    if(count==1)
	    {
	    	System.out.println(key+"is found at the index"+i);
	    }
	    	else
	    		System.out.println(key+"is not found");
	    }
		
		
		
	}


