
public class TransposeMatrix {

	public static void main(String[] args) {

		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
	int[][] output = transpose(arr);
	for(int i = 0; i<output.length;i++) {
		for(int j =0;j<output.length;j++) {
			System.out.print(output[i][j]+"\t");
		}
		System.out.println();
	}
		
	}
	static int[][] transpose(int[][] a) {
		
		int m = a.length;
		int n = a[0].length;
		
		int[][] temporary = new int[n][m];
		
		for(int row = 0; row < m;row++) {
			for(int col = 0; col < n; col++) {
				temporary[col][row] = a[row][col];
			}
		}
		
		return temporary;
	}

}
