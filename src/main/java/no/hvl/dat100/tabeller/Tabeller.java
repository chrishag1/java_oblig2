package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int tall : tabell){
			System.out.print("%s ".formatted(tall));
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String retur = "";

		for (int i = 0; i < tabell.length; i++){
			retur += tabell[i] + " ";
		}

		retur = retur.trim();
		retur = retur.replace(" ", ",");

		return "[" + retur + "]";
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int tall : tabell){
			sum += tall;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int t : tabell){
			if (t == tall){
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++){
			if (tabell[i] == tall){
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revers = new int[tabell.length];

		for (int i = tabell.length-1; i >= 0; i--){
			int revers_index = (tabell.length-1) - i;
			revers[revers_index] = tabell[i];
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++){
			if (tabell[i] < tabell[i-1]){
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] ny_tabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++){
			ny_tabell[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++){
			ny_tabell[tabell1.length + i] = tabell2[i];
		}

		return ny_tabell;
	}
}