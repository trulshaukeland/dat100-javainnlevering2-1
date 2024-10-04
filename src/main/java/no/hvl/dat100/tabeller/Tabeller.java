package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int element : tabell) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		if (tabell == null || tabell.length == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < tabell.length; i++) {
			sb.append(tabell[i]);
			if (i < tabell.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i : tabell) {
			if (i == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversed = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversed[i] = tabell[tabell.length - 1 - i];
		}
		return reversed;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		int[] sammensatt = new int[lengde1 + lengde2];

		for (int i = 0; i < lengde1; i++) {
			sammensatt[i] = tabell1[i];
		}

		for (int i = 0; i < lengde2; i++) {
			sammensatt[lengde1 + i] = tabell2[i];
		}

		return sammensatt;
	}

	// Test i main-metoden
	public static void main(String[] args) {
		int[] tabell = {1, 2, 3, 4, 5};
		skrivUt(tabell);
	}
}
