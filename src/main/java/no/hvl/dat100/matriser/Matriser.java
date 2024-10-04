package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int element : rad) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder sb = new StringBuilder();
		for (int[] rad : matrise) {
			for (int element : rad) {
				sb.append(element).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] resultat = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                resultat[i][j] = matrise[i][j] * tall;
            }
        }
        return resultat;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {
        int[][] speilet = new int[matrise[0].length][matrise.length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                speilet[j][i] = matrise[i][j];
            }
        }
        return speilet;
    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Antall kolonner i matrise A må være lik antall rader i matrise B.");
        }

        int[][] resultat = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultat[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultat;
    }

    // Test i main-metoden
    public static void main(String[] args) {
        int[][] matrise = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        skrivUt(matrise);
        System.out.println(tilStreng(matrise));
    }
}