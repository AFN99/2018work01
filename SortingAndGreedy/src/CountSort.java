import java.util.Scanner;
public class CountSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[11];
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			cnt[a[i]]++;
		}
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < cnt[i]; j++) System.out.print(i + " ");
		}
		System.out.println();
	}
}
