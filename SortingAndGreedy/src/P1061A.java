import java.util.*;
public class P1061A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = sc.nextInt();
		int ans = s / n;
		if (s % n != 0) ans++;
		System.out.println(ans);
	}
}
