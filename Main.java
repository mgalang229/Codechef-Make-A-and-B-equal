import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt(), b = fs.nextInt();
			if (b < a) {
				int temp = a;
				a = b;
				b = temp;
			}
			if (b % a != 0) {
				System.out.println("NO");
				continue;
			}
			System.out.println(isPowerTwo(b / a) ? "YES" : "NO");
		}
		fs.close();
	}
	
	static boolean isPowerTwo(int x) {
		int count = 0;
		for (int bit = 0; bit < 32; bit++) {
			if (hasBit(x, bit)) {
				count++;
			}
		}
		return count == 1;
	}
	
	static boolean hasBit(int x, int bit) {
		return (x & (1 << bit)) != 0;
	}
}
