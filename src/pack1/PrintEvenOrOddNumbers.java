package pack1;

public class PrintEvenOrOddNumbers {

	public static void main(String[] args) {
		for (int i = 0; i <20; i++) {

			if (i % 2 == 0) {
				System.out.println("Even numbers are:"+ i);
			}
		}
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd numbers are :"+ i);
			}

		}

	}

}
