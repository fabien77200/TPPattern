package domaine;

public class TartifletteCorse extends Tartiflette{


	public TartifletteCorse() {
		super("Corsica");
	}

	@Override
	public void ajouterFromage() {
		System.out.println("Ajouter 100 g de fromage de ch�vre");
	}

	@Override
	public void ajouterSpecialitesReg() {
		System.out.println("couper puis m�langer trois saucissons");	
		}

}
