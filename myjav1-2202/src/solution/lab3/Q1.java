package solution.lab3;

import java.util.Scanner;

public class Q1 {

	static Scanner scan = new Scanner(System.in);

	static public void show() {

		System.out.println("Enter num1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter num2: ");
		int num2 = scan.nextInt();
		System.out.println("Enter num3: ");
		int num3 = scan.nextInt();

		sort(num1, num2, num3);
		System.out.println("====================================");
	}

	public static void sort(int n1, int n2, int n3) {
		int temp;
		if (n2 < n1) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n3 < n2) {
			temp = n2;
			n2 = n3;
			n3 = temp;

			if (n2 < n1) {
				temp = n1;
				n1 = n2;
				n2 = temp;
			}
		}
		System.out.printf("Sorted: %d %d %d\n", n1, n2, n3);
		
	}

}
