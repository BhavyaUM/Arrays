package mostimportant;

import java.util.Arrays;

public class LargestAndSmallestArray {
public static void main(String[] args) {
	int a[]= {10,4,23,57};
	Arrays.sort(a);
	System.out.println("Smallest Element");
	System.out.println(a[0]);

	System.out.println("Largest Element");
	System.out.println(a[a.length-1]);
}
}
