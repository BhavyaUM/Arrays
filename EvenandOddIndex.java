// find the sum of array elements which are presented at even index and find the sum of array element presented at odd index
package Arrays;
import java.util.Scanner;
public class EvenandOddIndex {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int sum=0;
	int sum1=0;
	System.out.println("enter the size of an array");
	int size=s1.nextInt();
	int a[]=new int[size];
	System.out.println("enter the elements of an array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s1.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	    if(i%2==0)
		{
			sum=sum+a[i];
		}
		else
		{
			sum1=sum1+a[i];
		}
	}
	System.out.println(sum);
	System.out.println(sum1);
 }
}
