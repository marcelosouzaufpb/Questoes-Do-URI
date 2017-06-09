import java.util.Locale;
import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if ((a < b) && (b < c)) {
			System.out.println("" + a);
			System.out.println("" + b);
			System.out.println("" + c);
		} else if ((a < c) && (c < b)) {
			System.out.println("" + a);
			System.out.println("" + c);
			System.out.println("" + b);
		} else if ((b < a) && (a < c)) {
			System.out.println("" + b);
			System.out.println("" + a);
			System.out.println("" + c);
		} else if ((b < c) && (c < a)) {
			System.out.println("" + b);
			System.out.println("" + c);
			System.out.println("" + a);
		} else if ((c < a) && (a < b)) {
			System.out.println("" + c);
			System.out.println("" + a);
			System.out.println("" + b);
		} else if ((c < b) && (c < a)) {
			System.out.println("" + c);
			System.out.println("" + b);
			System.out.println("" + a);
		}
		System.out.println();

		System.out.println("" + a);
		System.out.println("" + b);
		System.out.println("" + c);
		scan.close();
	}

}