package mostimportant;

public class RemoveDuplicatesInTheArray {
public static void main(String[] args) {
	int a[]= {32,12,45,32,43,56,12,45};
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
				break;
			}
		}
	}
}
}
