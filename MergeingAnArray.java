package Arrays;

public class MergeingAnArray {
public static void main(String[] args) {
	int a[]= {10,45,34};
	int b[]= {76,54,74};
	int size = a.length+b.length;
	int c[]=new int[size];
	int j=0;int k=0;
	for(int i=0;i<c.length;i++) {
		if(i%2==0 && j<a.length) {
			c[i]=a[j];
			j++;
		}
		else {
			c[i]=b[k];
			k++;
		}
	}
	for(int i=0;i<c.length;i++) {
	System.out.println(c[i]);
	}
}
}
