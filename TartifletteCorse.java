package domaine;

public class TartifletteCorse extends Tartiflette{


	public TartifletteCorse() {
		super("Corsica");
	}

	@Override
	public void ajouterFromage() {
		System.out.println("Ajouter 100 g de fromage de chèvre");
	}

	@Override
	public void ajouterSpecialitesReg() {
		System.out.println("couper puis mélanger trois saucissons");	
		}

}
