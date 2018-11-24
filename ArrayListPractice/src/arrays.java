import java.util.Scanner;
public class arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] a1 = new int[n][m];
		int[][] a2 = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a1[i][j] + a2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
