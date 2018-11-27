import java.util.*;
//import java.util.Arrays
//import java.util.Scanner
public class JavaSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		//Arrays.sort(a);
		Arrays.sort(a, 1, 3);
		System.out.print(a[0]);
		for (int i = 1; i < n; i++) System.out.print(" " + a[i]);
		System.out.println();
	}
}
