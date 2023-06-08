package Arrays;

import java.util.Scanner;

public class RandomProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		System.out.println("enter names");
		for(int i=0; i<names.length;i++) {
			names[i]=sc.nextLine();
		}
		System.out.println("names of frinds stating from A:");
		for(int i=0; i<names.length;i++)
		if(names[i].charAt(0)=='A') {
			System.out.println(names[i]);
		}
	}
}
