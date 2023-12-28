public class Odd{
	public static void main(String[] args) {
		int[][] arr = {
				{2,4,9},
				{10,2,2},
				{3,1,19}
		};
		
	System.out.println(max(arr));
	}
	static int max(int[][] a) {
		
		int m = a.length;
		int n = a[0].length;
		int Max_val = 0;
		
		for(int row = 0; row < m;row++) {
			int sum = 0;
			for(int col = 0;col < n;col++ ) {
				sum += a[row][col];
			}
			if(sum > Max_val) {
				Max_val = sum;
			}
		}
		
		return Max_val;
	}
}