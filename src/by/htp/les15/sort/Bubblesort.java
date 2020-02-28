package by.htp.les15.sort;

public class Bubblesort {

	public static void main(String[] args) {
		
		int mass[] = new int[10];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 100 + 1);
			System.out.print(" " + mass[i]);
		}

		System.out.println();
		
		int tmp;
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = 0; j < mass.length - 1; j++) {

				if (mass[j] > mass[j + 1]) {
					tmp = mass[j];

					mass[j] = mass[j + 1];
					mass[j + 1] = tmp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			System.out.print(" " + mass[i]);
		}
		System.out.println();

	}

}
