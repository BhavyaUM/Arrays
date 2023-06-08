package mostimportant;

public class CopyOneArrayElementIntoAnother {
public static void main(String[] args) {
	int a[]= {10,30,40,45};
	int size = a.length;
	int b[]=new int[size];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];	
		}
	System.out.println("Elements of array a");
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	}
	System.out.println("elements of array b");
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
}
}
