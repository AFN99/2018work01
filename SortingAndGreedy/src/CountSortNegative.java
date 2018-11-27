import java.util.*;
public class CountSortNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[21];
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			cnt[a[i] + 10]++;
		}
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j < cnt[i]; j++) System.out.print((i - 10) + " ");
		}
		System.out.println();
	}
}
