import java.util.*;
public class ArrayListTry {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
		t--;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) a.add(i);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a.set(i, n - i);
			//a[i] = n - i
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			// a[i]
			sum += a.get(i);
		}
		System.out.println(sum);
		//for (int i = 0; i < n; i++) a.remove(0);
		a.clear();
		System.out.println(a.isEmpty());
		//a.indexOf(3)
		}
	}
}
