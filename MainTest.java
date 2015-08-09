package lanceur;

import domaine.TartifletteCorse;
import domaine.TartifletteNormande;
import domaine.TartifletteSavoyarde;

public class MainTest {

	public static void main(String[] args) {

		TartifletteNormande t1 = new TartifletteNormande();
		t1.faireTartiflette();
		TartifletteCorse t2 = new TartifletteCorse();
		t2.faireTartiflette();
		TartifletteSavoyarde t3 = new TartifletteSavoyarde();
		t3.faireTartiflette();
		
	}

}
