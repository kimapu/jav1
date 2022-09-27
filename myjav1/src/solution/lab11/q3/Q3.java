package solution.lab11.q3;

import java.util.Scanner;

import solution.lab11.Constant;

public class Q3 {

	static Scanner scan = new Scanner(System.in);

	public static void show() {

		ProductDA dao = new ProductDA(Constant.PATH_FILE);

		try {
			System.out.println("\n----------- FRUIT LIST [ORDER BY NAME]-----------------");
			dao.getAll().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n");
	}
	
}
