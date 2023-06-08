package Arrays;

import java.util.Scanner;

public class KeyElementIndex {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the the elements present inside the array are:");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println("enter the key element to search");
		int key=s.nextInt();
		int count=0;
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(key+ "is found at the index "+i);
		}
		else
		{
			System.out.println(key+ " is not found");
		}
		}
}
