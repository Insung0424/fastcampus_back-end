<<<<<<< HEAD
package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
			int[][] arr = {{1,2,3}, {1,2,3,4}};
			
			int i,j;
			
			for (i = 0; i<arr.length; i++) {
				
				for (j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j] + ",");
//					---프린트 프린트라인 잘 구분---
				}
				System.out.println("\t" + arr[i].length);
			}

	}

}
=======
package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
			int[][] arr = {{1,2,3}, {1,2,3,4}};
			
			int i,j;
			
			for (i = 0; i<arr.length; i++) {
				
				for (j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j] + ",");
//					---프린트 프린트라인 잘 구분---
				}
				System.out.println("\t" + arr[i].length);
			}

	}

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
