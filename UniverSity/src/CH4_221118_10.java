import java.util.*;

public class CH4_221118_10 {

	public static void main(String[] args) {
		int[][] arr = new int[3][9];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = (i + 2) * (j + 1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	} // end of main

} // end of class