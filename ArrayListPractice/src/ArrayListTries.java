import java.util.*;
public class ArrayListTries {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < 5; i++) a.add(new Character((char)((int)('a') + i)).toString());
		for (int i = 0; i < 5; i++) System.out.println(a.get(i));
		System.out.println(a.contains("a"));
		a.isEmpty();
		a.indexOf("a");
		a.remove(1);
		a.remove("e");
		a.set(1, "a");
		Collections.sort(a);
		a.clear();
	}
}
