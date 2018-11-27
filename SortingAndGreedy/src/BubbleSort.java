import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			boolean sorted = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int sub = a[j];
					a[j] = a[j + 1];
					a[j + 1] = sub;
					sorted = false;
				}
			}
			if (sorted) break;
		}
		System.out.print(a[0]);
		for (int i = 1; i < n; i++) System.out.print(" " + a[i]);
		System.out.println();
	}
}
