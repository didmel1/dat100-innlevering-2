package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tekst = "";
		for (int i = 0; i < tabell.length; i++) {
			tekst = tekst + tabell[i];
		}
        return tekst;
    }

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		for (int i = 0; i < tabell.length; i++) {

			if (tabell[i] == tall) {
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

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for (int i = 1; i < tabell.length; i++) {

			if (tabell[i] < tabell[i-1]) {
				return false;
			}

		}
		return true;
	}

	// h)
	public static int [] settSammen(int[] tabell1, int[] tabell2) {

        int[] tabell3 = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {

			tabell3[i]=tabell1[i];
		}

            for (int j = 0; j < tabell2.length; j++) {
			tabell3[tabell1.length + j]= tabell2[j];

            }


		return tabell3;
	}
}
