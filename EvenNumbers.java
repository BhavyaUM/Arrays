package Arrays;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the number:");
	int a=s1.nextInt();
	int count=0;
	if(a%2==0)
	{
		a--;
	}
	for(int i=0;count<a;i++)
	{
		if(i%2==1)
		{
			System.out.print(i+" ");
			count++;
		}
	}

	}

}
