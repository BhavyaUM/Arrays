package Arrays;
import java.util.Scanner;
public class OddNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the integer number:");
		int a=s.nextInt();
		int count=0;
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
