
public class FlipinganImage {

	public static void main(String[] args) {

		int[][] arr = {
				{1,0,0,0},
				{1,1,1,0},
				{0,1,1,1},
				{0,0,1,0}
		};
		
		int[][] result = flip(arr);
		
		for(int[] row : result) {
			 for (int col : row) {
	                System.out.print(col + " ");
	            }
	            System.out.println();
	        }
		}
	
	static int[][] flip(int[][] a) {
		
		int m = a.length;
		int n = a[0].length;
		
		int[][] temp = new int[m][n];
		
		for(int row = 0; row < a.length;row++) {
			int last =n-1;
			for(int col = 0; col < a.length;col++) {
				temp[row][col] = 1-a[row][last];
				last--;
			}
		}
		return temp;
	}

}
