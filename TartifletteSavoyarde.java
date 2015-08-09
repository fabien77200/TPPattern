package domaine;

public class TartifletteSavoyarde extends Tartiflette{

	public TartifletteSavoyarde() {
		super("l'originale");
	}
	
	
	@Override
	public void ajouterFromage() {
		System.out.println("Ajouter 100 g de Roblechon");
		
		
	}

	@Override
	public void ajouterSpecialitesReg() {
		System.out.println("couper puis mélanger trois champignons");	
	}
	

}
