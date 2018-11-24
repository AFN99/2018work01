import java.util.*;
public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int ai = sc.nextInt(); //a[i]
			a.add(ai);
		}
		int[] partialSum = new int[n];
		partialSum[0] = a.get(0);
		for (int i = 1; i < n; i++) partialSum[i] = partialSum[i - 1] + a.get(i);
		int mxSum2 = partialSum[k - 1];
		for (int i = k; i < n; i++) {
			mxSum2 = Math.max(mxSum2, partialSum[i] - partialSum[i - k]);
		}
		System.out.println(mxSum2);
		int kSum = 0;
		for (int i = 0; i < k; i++) kSum += a.get(i);
		int mxSum = kSum;
		for (int i = 1; i + k <= n; i++) {
			kSum = kSum - a.get(i - 1) + a.get(i + k - 1);
			mxSum = Math.max(mxSum, kSum);
		}
		System.out.println(mxSum);
	}
}
