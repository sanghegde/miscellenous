
//main method for finding the largest country based on area and population
import java.util.Scanner;

public class CountryTest {
	// private static country country;

	public static void main(String args[]) {
		double area1, area2, area3;
		int pop1, pop2, pop3;
		country Country = new country(null, 0, 0);
		Scanner scanner = new Scanner(System.in);
		String arr[] = new String[3];
		// String name;
		System.out.println("enter the country name");
		for (int i = 0; i < 3; i++) {

			arr[i] = scanner.nextLine();
			// System.out.println(arr[i]);
		}

		System.out.println("enter the first country1 with area and population");
		area1 = scanner.nextDouble();
		pop1 = scanner.nextInt();
		System.out.println("enter the second country2 with area and population");
		area2 = scanner.nextDouble();
		pop2 = scanner.nextInt();
		System.out.println("enter the third country3 with area and population");
		area3 = scanner.nextDouble();
		pop3 = scanner.nextInt();

		double area;
		int population;

		// calling method area for finding the largset country
		area = Country.largeArea(area1, area2, area3);
		System.out.println("largest country with area is:" + area);

		// calling method population for finding the largest country
		population = Country.largePop(pop1, pop2, pop3);
		System.out.println("largest country with area is:" + area);

	}

}
