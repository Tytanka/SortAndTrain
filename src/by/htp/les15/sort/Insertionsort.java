package by.htp.les15.sort;

public class Insertionsort {

	public static void main(String[] args) {

		int mass[] = new int[10];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 100 + 1);
			System.out.print(" " + mass[i]);
		}

		System.out.println();

		int key;
		for (int i = 1; i < mass.length; i++) {
			key = mass[i];
			int j = i - 1;
			while (j >= 0 && mass[j] > key) {
				mass[j + 1] = mass[j];
				j = j - 1;
			}
			mass[j + 1] = key;

		}

		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			System.out.print(" " + mass[i]);
		}
		System.out.println();

	}

}
