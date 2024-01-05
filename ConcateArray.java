import java.util.Arrays;

public class ConcateArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,1,2};
		int n = arr.length;
		int[] temp = new int[2*n];
		
		concate(arr,n,temp);
		
		
	}
	static void concate(int[] a,int n,int[] b) {
		
		for(int i=0; i<n;i++) {
			b[i+n] = b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
