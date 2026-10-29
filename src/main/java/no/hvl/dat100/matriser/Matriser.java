package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] liste : matrise){
			for (int tall : liste){
				System.out.print("%s ".formatted(tall));
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String tekst = "";

		for (int[] liste : matrise){
			String temp_teskt = "";
			for (int tall : liste){
				temp_teskt += "%s ".formatted(tall);
			}
			temp_teskt = temp_teskt.trim();
			tekst += temp_teskt +"\n";
		}
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] ny_matrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++){
			ny_matrise[i] = new int[matrise[i].length];
		}

		for (int i = 0; i < matrise.length; i++){
			for (int y = 0; y < matrise[i].length; y++){
				ny_matrise[i][y] = matrise[i][y] * tall;
			}
		}
		return ny_matrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length){
			return false;
		}

		for (int i = 0; i < a.length; i++){
			if (a[i].length != b[i].length){
				return false;
			}

			for (int y = 0; y < a[i].length; y++){
				if (a[i][y] != b[i][y]){
					return false;
				}
			}
		}

		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] ny_matrise = new int[matrise[0].length][];

		for (int i = 0; i < matrise[0].length; i++){
			ny_matrise[i] = new int[matrise.length];
		}

		for (int i = 0; i < ny_matrise.length; i++){
			for (int y = 0; y < ny_matrise[0].length; y++) {
				ny_matrise[i][y] = matrise[y][i];
			}
		}
		return ny_matrise;
	}


	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		if (a[0].length != b.length) {
			throw new UnsupportedOperationException("Matriks A sin rekke størrelse må være det same som matriks b sin rad størrelse");
		}

		int[][] ny_matrise = new int[a.length][b[0].length];

		for (int p = 0; p < ny_matrise.length; p++) {
			for (int m = 0; m < ny_matrise[0].length; m++) {

				int celle_total = 0;

				for (int i = 0; i < a[0].length; i++) {
					celle_total += a[p][i] * b[i][m];
				}
				ny_matrise[p][m] = celle_total;
			}
		}
		return ny_matrise;
	}
}
