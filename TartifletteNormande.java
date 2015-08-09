package domaine;

public class TartifletteNormande extends Tartiflette{

	public TartifletteNormande() {
		super("Normande");
	}
	
	@Override
	public void ajouterFromage() {
		System.out.println("Ajouter 100 g de Camembert");
		
	}

	@Override
	public void ajouterSpecialitesReg() {
		System.out.println("couper puis mélanger trois pommes");	
		}

}
