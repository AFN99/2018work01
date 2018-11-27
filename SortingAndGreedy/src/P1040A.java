import java.util.*;
public class P1040A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n / 2; i++) {
			//if ((a[i] == 0 && a[n - i - 1] == 1) || (a[i] == 1 && a[n - i - 1] == 0))
			if (a[i] != a[n - i - 1] && a[i] != 2 && a[n - i - 1] != 2) {
				System.out.println("-1");
				return;
			}
			if (a[i] == 2 && a[n - i - 1] == 2) ans += 2 * Math.min(A, B);
			else if (a[i] == 2) {
				if (a[n - i - 1] == 1) ans += B;
				else ans += A;
			}
			else if (a[n - i - 1] == 2) {
				if (a[i] == 1) ans += B;
				else ans += A;
			}
		}
		if (n % 2 == 1) if (a[n / 2] == 2) ans += Math.min(A, B);
		System.out.println(ans);
	}
}
